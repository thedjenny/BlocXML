package org.xtext.example.generator

import java.util.Stack
import org.xtext.example.Bloc

class ArduinoCodeGenerator {
	//String contient le code
	
	static var str = ""
  
  
  
  //Initialisation du code Arduino
  def initCode(Stack<Bloc> stack){
 //Nettoyage du code precedent
  	ArduinoCodeClear()
  	
  	//Parcourir la pile des elements, attribuer les types "double, bool,.." selon le bloc
  	for (element : stack) {
  		if(element.blocType=="in"){
  			str =str+ "double " + element.idCompo + "Value ; \n"
  		}
  		
  		if(element.blocType=="out"){
  			str = str + "boolean "+ element.idCompo + "Value ; \n"
  		}
  		
  		if(element.blocType=="inter"){
  			switch(element.idt){
  				//ADD_2
  				case "2010114":  {
  					str +=  '''
  					double temp«stack.indexOf(element)»;
  					double «element.idCompo»Value(double var1, double var2 ){
  						return var1+var2;
  					}
  					'''
  				}
  				//Inferior
  				case "2010351" :{
  					str += '''
  					boolean temp«stack.indexOf(element)»;
  					 boolean «element.idCompo»Value(double var1, double var2){
  						return (var1 < var2);
  					}
  					'''
  				}
  			}
  		}
  		
  	}
  	return str
  }
  
  
  // partie Setup 
 
  def setupCode(Stack<Bloc> stack){
  	
  	// appel a l'initialisation 
  	str = "\n" + initCode(stack)
  	  	
  	
  	// Baude rate, à default 9600, pourrait etre decrit par AS plus tard
  	str += '''
  	void setup(){
  		Serial.begin(9600);
  	''' 
  	
  	
  	
  	//attribuer les types de ports des blocs dans le Setup (A specifier par AS plus tard)
  	for (element : stack) {
  		if(element.blocType=="in"){
  			if(element.idt=="2010122"){
  				// to be implemented
  			}
  			if(element.idt=="2010121"){
  			str += "\n pinMode("+ element.idCompo+"Value ,INPUT);"	
  			}
  			
  		}
  		if(element.blocType=="out"){
  			str += "\n pinMode(13,OUTPUT);"
  		}
  	}
  	str += "} \n"
	return str;
  }
  
 def ArduinoCodeGen(Stack<Bloc> stack){
 	str = "\n" + setupCode(stack)
 	str += "void loop(){ \n"
 	
 	for (element : stack) {
 		if(element.blocType=="in"){
 			if(element.idt=="2010121"){
 				//Valeur des blocs A specifier par Arduino
 				str+=element.idCompo+"Value = 6; \n"
 			}
 			if(element.idt=="2010122"){
 				//Valeur des blocs a specifier par Arduino
 				str+=element.idCompo+"Value = 10; \n"
 			}
 			 			
 		}
 		
 		
 		if(element.blocType=="inter"){
 				switch(element.idt){
  				//ADD_2
  				case "2010114":  {
  					//2 valeurs viennent resultent d'execution d'un autre bloc
  					if(element.voisins.get(0).blocType=="inter" && element.voisins.get(1).blocType=="inter" ){
  			
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(temp«stack.indexOf(element.voisins.get(0))»,temp«stack.indexOf(element.voisins.get(1))-1»);
  					'''  						
  					}
  					
  					// 1 intermediaire et 1 de type input (constant bloc, in bloc etc.)
  					if(element.voisins.get(1).blocType=="inter" && element.voisins.get(0).blocType!="inter" ){
  				
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,temp«stack.indexOf(element.voisins.get(1))-1»);
  					'''  						
  					}
  					//1 constant et l'autre in
  					if(element.voisins.get(0).blocType=="inter" && element.voisins.get(1).blocType!="inter"){
  				
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,«element.voisins.get(1).idCompo»Value);
  					'''  
  					}
  					
  					// 2 entrees de types "in"
  					if(element.voisins.get(0).blocType!="inter" && element.voisins.get(1).blocType!="inter"){
  		
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,«element.voisins.get(1).idCompo»Value);
  					'''  
  					}
  					
  				}
  				
  				
  				
  				//Inferior
  				case "2010351" :{
  					//2 valeurs viennent resultent d'execution d'un autre bloc
  					if(element.voisins.get(0).blocType=="inter" && element.voisins.get(1).blocType=="inter" ){
  				
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(temp«stack.indexOf(element.voisins.get(0))-1»,temp«stack.indexOf(element.voisins.get(1))-1»);
  					'''  						
  					}
  				  	
  				  	// 1 intermediaire et 1 de type input (constant bloc, in bloc etc.)	
  					if(element.voisins.get(1).blocType=="inter" && element.voisins.get(0).blocType!="inter" ){
  					
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,temp«stack.indexOf(stack.findFirst[bloc | bloc.idCompo == element.idCompo])-1»);
  					'''  						
  					}
  					//1 constant et l'autre in
  					if(element.voisins.get(0).blocType=="inter" && element.voisins.get(1).blocType!="inter"){
  					
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,«element.voisins.get(1).idCompo»Value);
  					'''  
  					}
  					// 2 entrees de types "in"
  					if(element.voisins.get(0).blocType!="inter" && element.voisins.get(1).blocType!="inter"){
  					
  					str +=  '''temp«stack.indexOf(element)» = «element.idCompo»Value(«element.voisins.get(0).idCompo»Value,«element.voisins.get(1).idCompo»Value);
  					'''  
  					} 
  				}
  			}
 			}
 			
 			//un output aura le type "digit,analog" a specifier par AS
 			// indexOf l'element precedent
 			if(element.blocType=="out"){
 				str+='''digitalWrite(13,temp«(stack.indexOf(element))-1»);
 			}'''
 			}
 	}
   return str;
 } 
 
 
 
 
 def ArduinoCodeClear(){
 	str = ""
 }
}
