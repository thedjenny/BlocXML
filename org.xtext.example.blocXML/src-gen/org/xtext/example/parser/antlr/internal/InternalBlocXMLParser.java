package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.BlocXMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBlocXMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<?xml version = \"1.0\" encoding = \"UTF-16\"?>'", "'<netlist\\txmlns=\"urn:netlist-schema\"\\r\\n\\t\\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\\r\\n\\t\\txsi:schemaLocation=\"urn:netlist-schema ValidationRules.xsd\" >'", "'<!--Famic Technologies Inc.-->'", "'<!--Automation Studio-->'", "'<!--Export-->'", "'<documents>'", "'<document Name='", "' DiagramType='", "'>'", "'</document>'", "'</documents>'", "'</netlist>'", "'<layer Name='", "' Visible=\"true\" Simulated=\"true\" Locked=\"false\"'", "'</layer>'", "'<component ComponentID='", "' IDA='", "' IDF='", "' IDT='", "'</component>'", "'<variable_type Name='", "'</variable_type>'", "'<t'", "' Name='", "'</t'", "'<nodes>'", "'</nodes>'", "'<node Name='", "' Technology=\"Bloc\">'", "'</node>'", "'<link CompID='", "' PortID='", "' PortName='", "' PortDirection='", "'/>'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBlocXMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBlocXMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBlocXMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBlocXML.g"; }



     	private BlocXMLGrammarAccess grammarAccess;

        public InternalBlocXMLParser(TokenStream input, BlocXMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ExportModel";
       	}

       	@Override
       	protected BlocXMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExportModel"
    // InternalBlocXML.g:64:1: entryRuleExportModel returns [EObject current=null] : iv_ruleExportModel= ruleExportModel EOF ;
    public final EObject entryRuleExportModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportModel = null;


        try {
            // InternalBlocXML.g:64:52: (iv_ruleExportModel= ruleExportModel EOF )
            // InternalBlocXML.g:65:2: iv_ruleExportModel= ruleExportModel EOF
            {
             newCompositeNode(grammarAccess.getExportModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExportModel=ruleExportModel();

            state._fsp--;

             current =iv_ruleExportModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExportModel"


    // $ANTLR start "ruleExportModel"
    // InternalBlocXML.g:71:1: ruleExportModel returns [EObject current=null] : (otherlv_0= '<?xml version = \"1.0\" encoding = \"UTF-16\"?>' ( (lv_export_1_0= ruleNetlistType ) ) ) ;
    public final EObject ruleExportModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_export_1_0 = null;



        	enterRule();

        try {
            // InternalBlocXML.g:77:2: ( (otherlv_0= '<?xml version = \"1.0\" encoding = \"UTF-16\"?>' ( (lv_export_1_0= ruleNetlistType ) ) ) )
            // InternalBlocXML.g:78:2: (otherlv_0= '<?xml version = \"1.0\" encoding = \"UTF-16\"?>' ( (lv_export_1_0= ruleNetlistType ) ) )
            {
            // InternalBlocXML.g:78:2: (otherlv_0= '<?xml version = \"1.0\" encoding = \"UTF-16\"?>' ( (lv_export_1_0= ruleNetlistType ) ) )
            // InternalBlocXML.g:79:3: otherlv_0= '<?xml version = \"1.0\" encoding = \"UTF-16\"?>' ( (lv_export_1_0= ruleNetlistType ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExportModelAccess().getXmlVersion10EncodingUTF16Keyword_0());
            		
            // InternalBlocXML.g:83:3: ( (lv_export_1_0= ruleNetlistType ) )
            // InternalBlocXML.g:84:4: (lv_export_1_0= ruleNetlistType )
            {
            // InternalBlocXML.g:84:4: (lv_export_1_0= ruleNetlistType )
            // InternalBlocXML.g:85:5: lv_export_1_0= ruleNetlistType
            {

            					newCompositeNode(grammarAccess.getExportModelAccess().getExportNetlistTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_export_1_0=ruleNetlistType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExportModelRule());
            					}
            					set(
            						current,
            						"export",
            						lv_export_1_0,
            						"org.xtext.example.BlocXML.NetlistType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExportModel"


    // $ANTLR start "entryRuleNetlistType"
    // InternalBlocXML.g:106:1: entryRuleNetlistType returns [EObject current=null] : iv_ruleNetlistType= ruleNetlistType EOF ;
    public final EObject entryRuleNetlistType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetlistType = null;


        try {
            // InternalBlocXML.g:106:52: (iv_ruleNetlistType= ruleNetlistType EOF )
            // InternalBlocXML.g:107:2: iv_ruleNetlistType= ruleNetlistType EOF
            {
             newCompositeNode(grammarAccess.getNetlistTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetlistType=ruleNetlistType();

            state._fsp--;

             current =iv_ruleNetlistType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNetlistType"


    // $ANTLR start "ruleNetlistType"
    // InternalBlocXML.g:113:1: ruleNetlistType returns [EObject current=null] : ( (otherlv_0= '<netlist\\txmlns=\"urn:netlist-schema\"\\r\\n\\t\\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\\r\\n\\t\\txsi:schemaLocation=\"urn:netlist-schema ValidationRules.xsd\" >' )? (otherlv_1= '<!--Famic Technologies Inc.-->' )? (otherlv_2= '<!--Automation Studio-->' )? (otherlv_3= '<!--Export-->' )? otherlv_4= '<documents>' otherlv_5= '<document Name=' ( (lv_docname_6_0= RULE_STRING ) ) (otherlv_7= ' DiagramType=' ( (lv_doctype_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_layer_10_0= ruleLayer ) )* otherlv_11= '</document>' otherlv_12= '</documents>' ( (lv_nodes_13_0= ruleNodes ) ) otherlv_14= '</netlist>' ) ;
    public final EObject ruleNetlistType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_docname_6_0=null;
        Token otherlv_7=null;
        Token lv_doctype_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_layer_10_0 = null;

        EObject lv_nodes_13_0 = null;



        	enterRule();

        try {
            // InternalBlocXML.g:119:2: ( ( (otherlv_0= '<netlist\\txmlns=\"urn:netlist-schema\"\\r\\n\\t\\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\\r\\n\\t\\txsi:schemaLocation=\"urn:netlist-schema ValidationRules.xsd\" >' )? (otherlv_1= '<!--Famic Technologies Inc.-->' )? (otherlv_2= '<!--Automation Studio-->' )? (otherlv_3= '<!--Export-->' )? otherlv_4= '<documents>' otherlv_5= '<document Name=' ( (lv_docname_6_0= RULE_STRING ) ) (otherlv_7= ' DiagramType=' ( (lv_doctype_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_layer_10_0= ruleLayer ) )* otherlv_11= '</document>' otherlv_12= '</documents>' ( (lv_nodes_13_0= ruleNodes ) ) otherlv_14= '</netlist>' ) )
            // InternalBlocXML.g:120:2: ( (otherlv_0= '<netlist\\txmlns=\"urn:netlist-schema\"\\r\\n\\t\\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\\r\\n\\t\\txsi:schemaLocation=\"urn:netlist-schema ValidationRules.xsd\" >' )? (otherlv_1= '<!--Famic Technologies Inc.-->' )? (otherlv_2= '<!--Automation Studio-->' )? (otherlv_3= '<!--Export-->' )? otherlv_4= '<documents>' otherlv_5= '<document Name=' ( (lv_docname_6_0= RULE_STRING ) ) (otherlv_7= ' DiagramType=' ( (lv_doctype_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_layer_10_0= ruleLayer ) )* otherlv_11= '</document>' otherlv_12= '</documents>' ( (lv_nodes_13_0= ruleNodes ) ) otherlv_14= '</netlist>' )
            {
            // InternalBlocXML.g:120:2: ( (otherlv_0= '<netlist\\txmlns=\"urn:netlist-schema\"\\r\\n\\t\\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\\r\\n\\t\\txsi:schemaLocation=\"urn:netlist-schema ValidationRules.xsd\" >' )? (otherlv_1= '<!--Famic Technologies Inc.-->' )? (otherlv_2= '<!--Automation Studio-->' )? (otherlv_3= '<!--Export-->' )? otherlv_4= '<documents>' otherlv_5= '<document Name=' ( (lv_docname_6_0= RULE_STRING ) ) (otherlv_7= ' DiagramType=' ( (lv_doctype_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_layer_10_0= ruleLayer ) )* otherlv_11= '</document>' otherlv_12= '</documents>' ( (lv_nodes_13_0= ruleNodes ) ) otherlv_14= '</netlist>' )
            // InternalBlocXML.g:121:3: (otherlv_0= '<netlist\\txmlns=\"urn:netlist-schema\"\\r\\n\\t\\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\\r\\n\\t\\txsi:schemaLocation=\"urn:netlist-schema ValidationRules.xsd\" >' )? (otherlv_1= '<!--Famic Technologies Inc.-->' )? (otherlv_2= '<!--Automation Studio-->' )? (otherlv_3= '<!--Export-->' )? otherlv_4= '<documents>' otherlv_5= '<document Name=' ( (lv_docname_6_0= RULE_STRING ) ) (otherlv_7= ' DiagramType=' ( (lv_doctype_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_layer_10_0= ruleLayer ) )* otherlv_11= '</document>' otherlv_12= '</documents>' ( (lv_nodes_13_0= ruleNodes ) ) otherlv_14= '</netlist>'
            {
            // InternalBlocXML.g:121:3: (otherlv_0= '<netlist\\txmlns=\"urn:netlist-schema\"\\r\\n\\t\\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\\r\\n\\t\\txsi:schemaLocation=\"urn:netlist-schema ValidationRules.xsd\" >' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBlocXML.g:122:4: otherlv_0= '<netlist\\txmlns=\"urn:netlist-schema\"\\r\\n\\t\\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\\r\\n\\t\\txsi:schemaLocation=\"urn:netlist-schema ValidationRules.xsd\" >'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getNetlistTypeAccess().getNetlistXmlnsUrnNetlistSchemaXmlnsXsiHttpWwwW3Org2001XMLSchemaInstanceXsiSchemaLocationUrnNetlistSchemaValidationRulesXsdKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBlocXML.g:127:3: (otherlv_1= '<!--Famic Technologies Inc.-->' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBlocXML.g:128:4: otherlv_1= '<!--Famic Technologies Inc.-->'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getNetlistTypeAccess().getFamicTechnologiesIncKeyword_1());
                    			

                    }
                    break;

            }

            // InternalBlocXML.g:133:3: (otherlv_2= '<!--Automation Studio-->' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBlocXML.g:134:4: otherlv_2= '<!--Automation Studio-->'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getNetlistTypeAccess().getAutomationStudioKeyword_2());
                    			

                    }
                    break;

            }

            // InternalBlocXML.g:139:3: (otherlv_3= '<!--Export-->' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBlocXML.g:140:4: otherlv_3= '<!--Export-->'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getNetlistTypeAccess().getExportKeyword_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getNetlistTypeAccess().getDocumentsKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getNetlistTypeAccess().getDocumentNameKeyword_5());
            		
            // InternalBlocXML.g:153:3: ( (lv_docname_6_0= RULE_STRING ) )
            // InternalBlocXML.g:154:4: (lv_docname_6_0= RULE_STRING )
            {
            // InternalBlocXML.g:154:4: (lv_docname_6_0= RULE_STRING )
            // InternalBlocXML.g:155:5: lv_docname_6_0= RULE_STRING
            {
            lv_docname_6_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_docname_6_0, grammarAccess.getNetlistTypeAccess().getDocnameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetlistTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"docname",
            						lv_docname_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBlocXML.g:171:3: (otherlv_7= ' DiagramType=' ( (lv_doctype_8_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBlocXML.g:172:4: otherlv_7= ' DiagramType=' ( (lv_doctype_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getNetlistTypeAccess().getDiagramTypeKeyword_7_0());
                    			
                    // InternalBlocXML.g:176:4: ( (lv_doctype_8_0= RULE_STRING ) )
                    // InternalBlocXML.g:177:5: (lv_doctype_8_0= RULE_STRING )
                    {
                    // InternalBlocXML.g:177:5: (lv_doctype_8_0= RULE_STRING )
                    // InternalBlocXML.g:178:6: lv_doctype_8_0= RULE_STRING
                    {
                    lv_doctype_8_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_doctype_8_0, grammarAccess.getNetlistTypeAccess().getDoctypeSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNetlistTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"doctype",
                    							lv_doctype_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getNetlistTypeAccess().getGreaterThanSignKeyword_8());
            		
            // InternalBlocXML.g:199:3: ( (lv_layer_10_0= ruleLayer ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBlocXML.g:200:4: (lv_layer_10_0= ruleLayer )
            	    {
            	    // InternalBlocXML.g:200:4: (lv_layer_10_0= ruleLayer )
            	    // InternalBlocXML.g:201:5: lv_layer_10_0= ruleLayer
            	    {

            	    					newCompositeNode(grammarAccess.getNetlistTypeAccess().getLayerLayerParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_layer_10_0=ruleLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNetlistTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layer",
            	    						lv_layer_10_0,
            	    						"org.xtext.example.BlocXML.Layer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_11=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getNetlistTypeAccess().getDocumentKeyword_10());
            		
            otherlv_12=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getNetlistTypeAccess().getDocumentsKeyword_11());
            		
            // InternalBlocXML.g:226:3: ( (lv_nodes_13_0= ruleNodes ) )
            // InternalBlocXML.g:227:4: (lv_nodes_13_0= ruleNodes )
            {
            // InternalBlocXML.g:227:4: (lv_nodes_13_0= ruleNodes )
            // InternalBlocXML.g:228:5: lv_nodes_13_0= ruleNodes
            {

            					newCompositeNode(grammarAccess.getNetlistTypeAccess().getNodesNodesParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_15);
            lv_nodes_13_0=ruleNodes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetlistTypeRule());
            					}
            					set(
            						current,
            						"nodes",
            						lv_nodes_13_0,
            						"org.xtext.example.BlocXML.Nodes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getNetlistTypeAccess().getNetlistKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNetlistType"


    // $ANTLR start "entryRuleLayer"
    // InternalBlocXML.g:253:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalBlocXML.g:253:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalBlocXML.g:254:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalBlocXML.g:260:1: ruleLayer returns [EObject current=null] : (otherlv_0= '<layer Name=' ( (lv_coucheName_1_0= RULE_STRING ) ) (otherlv_2= ' Visible=\"true\" Simulated=\"true\" Locked=\"false\"' )? otherlv_3= '>' ( (lv_components_4_0= ruleComponent ) )* otherlv_5= '</layer>' ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_coucheName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_components_4_0 = null;



        	enterRule();

        try {
            // InternalBlocXML.g:266:2: ( (otherlv_0= '<layer Name=' ( (lv_coucheName_1_0= RULE_STRING ) ) (otherlv_2= ' Visible=\"true\" Simulated=\"true\" Locked=\"false\"' )? otherlv_3= '>' ( (lv_components_4_0= ruleComponent ) )* otherlv_5= '</layer>' ) )
            // InternalBlocXML.g:267:2: (otherlv_0= '<layer Name=' ( (lv_coucheName_1_0= RULE_STRING ) ) (otherlv_2= ' Visible=\"true\" Simulated=\"true\" Locked=\"false\"' )? otherlv_3= '>' ( (lv_components_4_0= ruleComponent ) )* otherlv_5= '</layer>' )
            {
            // InternalBlocXML.g:267:2: (otherlv_0= '<layer Name=' ( (lv_coucheName_1_0= RULE_STRING ) ) (otherlv_2= ' Visible=\"true\" Simulated=\"true\" Locked=\"false\"' )? otherlv_3= '>' ( (lv_components_4_0= ruleComponent ) )* otherlv_5= '</layer>' )
            // InternalBlocXML.g:268:3: otherlv_0= '<layer Name=' ( (lv_coucheName_1_0= RULE_STRING ) ) (otherlv_2= ' Visible=\"true\" Simulated=\"true\" Locked=\"false\"' )? otherlv_3= '>' ( (lv_components_4_0= ruleComponent ) )* otherlv_5= '</layer>'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLayerAccess().getLayerNameKeyword_0());
            		
            // InternalBlocXML.g:272:3: ( (lv_coucheName_1_0= RULE_STRING ) )
            // InternalBlocXML.g:273:4: (lv_coucheName_1_0= RULE_STRING )
            {
            // InternalBlocXML.g:273:4: (lv_coucheName_1_0= RULE_STRING )
            // InternalBlocXML.g:274:5: lv_coucheName_1_0= RULE_STRING
            {
            lv_coucheName_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_coucheName_1_0, grammarAccess.getLayerAccess().getCoucheNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLayerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"coucheName",
            						lv_coucheName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBlocXML.g:290:3: (otherlv_2= ' Visible=\"true\" Simulated=\"true\" Locked=\"false\"' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBlocXML.g:291:4: otherlv_2= ' Visible=\"true\" Simulated=\"true\" Locked=\"false\"'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getLayerAccess().getVisibleTrueSimulatedTrueLockedFalseKeyword_2());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getLayerAccess().getGreaterThanSignKeyword_3());
            		
            // InternalBlocXML.g:300:3: ( (lv_components_4_0= ruleComponent ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBlocXML.g:301:4: (lv_components_4_0= ruleComponent )
            	    {
            	    // InternalBlocXML.g:301:4: (lv_components_4_0= ruleComponent )
            	    // InternalBlocXML.g:302:5: lv_components_4_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getLayerAccess().getComponentsComponentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_components_4_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_4_0,
            	    						"org.xtext.example.BlocXML.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLayerAccess().getLayerKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleComponent"
    // InternalBlocXML.g:327:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalBlocXML.g:327:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalBlocXML.g:328:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalBlocXML.g:334:1: ruleComponent returns [EObject current=null] : (otherlv_0= '<component ComponentID=' ( (lv_compoId_1_0= RULE_STRING ) ) otherlv_2= ' IDA=' ( (lv_compoIda_3_0= RULE_STRING ) ) otherlv_4= ' IDF=' ( (lv_compoIdf_5_0= RULE_STRING ) ) otherlv_6= ' IDT=' ( (lv_compoIdt_7_0= RULE_STRING ) ) otherlv_8= '>' ( (lv_vars_9_0= ruleVariable ) )* otherlv_10= '</component>' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_compoId_1_0=null;
        Token otherlv_2=null;
        Token lv_compoIda_3_0=null;
        Token otherlv_4=null;
        Token lv_compoIdf_5_0=null;
        Token otherlv_6=null;
        Token lv_compoIdt_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_vars_9_0 = null;



        	enterRule();

        try {
            // InternalBlocXML.g:340:2: ( (otherlv_0= '<component ComponentID=' ( (lv_compoId_1_0= RULE_STRING ) ) otherlv_2= ' IDA=' ( (lv_compoIda_3_0= RULE_STRING ) ) otherlv_4= ' IDF=' ( (lv_compoIdf_5_0= RULE_STRING ) ) otherlv_6= ' IDT=' ( (lv_compoIdt_7_0= RULE_STRING ) ) otherlv_8= '>' ( (lv_vars_9_0= ruleVariable ) )* otherlv_10= '</component>' ) )
            // InternalBlocXML.g:341:2: (otherlv_0= '<component ComponentID=' ( (lv_compoId_1_0= RULE_STRING ) ) otherlv_2= ' IDA=' ( (lv_compoIda_3_0= RULE_STRING ) ) otherlv_4= ' IDF=' ( (lv_compoIdf_5_0= RULE_STRING ) ) otherlv_6= ' IDT=' ( (lv_compoIdt_7_0= RULE_STRING ) ) otherlv_8= '>' ( (lv_vars_9_0= ruleVariable ) )* otherlv_10= '</component>' )
            {
            // InternalBlocXML.g:341:2: (otherlv_0= '<component ComponentID=' ( (lv_compoId_1_0= RULE_STRING ) ) otherlv_2= ' IDA=' ( (lv_compoIda_3_0= RULE_STRING ) ) otherlv_4= ' IDF=' ( (lv_compoIdf_5_0= RULE_STRING ) ) otherlv_6= ' IDT=' ( (lv_compoIdt_7_0= RULE_STRING ) ) otherlv_8= '>' ( (lv_vars_9_0= ruleVariable ) )* otherlv_10= '</component>' )
            // InternalBlocXML.g:342:3: otherlv_0= '<component ComponentID=' ( (lv_compoId_1_0= RULE_STRING ) ) otherlv_2= ' IDA=' ( (lv_compoIda_3_0= RULE_STRING ) ) otherlv_4= ' IDF=' ( (lv_compoIdf_5_0= RULE_STRING ) ) otherlv_6= ' IDT=' ( (lv_compoIdt_7_0= RULE_STRING ) ) otherlv_8= '>' ( (lv_vars_9_0= ruleVariable ) )* otherlv_10= '</component>'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentComponentIDKeyword_0());
            		
            // InternalBlocXML.g:346:3: ( (lv_compoId_1_0= RULE_STRING ) )
            // InternalBlocXML.g:347:4: (lv_compoId_1_0= RULE_STRING )
            {
            // InternalBlocXML.g:347:4: (lv_compoId_1_0= RULE_STRING )
            // InternalBlocXML.g:348:5: lv_compoId_1_0= RULE_STRING
            {
            lv_compoId_1_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_compoId_1_0, grammarAccess.getComponentAccess().getCompoIdSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"compoId",
            						lv_compoId_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getIDAKeyword_2());
            		
            // InternalBlocXML.g:368:3: ( (lv_compoIda_3_0= RULE_STRING ) )
            // InternalBlocXML.g:369:4: (lv_compoIda_3_0= RULE_STRING )
            {
            // InternalBlocXML.g:369:4: (lv_compoIda_3_0= RULE_STRING )
            // InternalBlocXML.g:370:5: lv_compoIda_3_0= RULE_STRING
            {
            lv_compoIda_3_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_compoIda_3_0, grammarAccess.getComponentAccess().getCompoIdaSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"compoIda",
            						lv_compoIda_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getIDFKeyword_4());
            		
            // InternalBlocXML.g:390:3: ( (lv_compoIdf_5_0= RULE_STRING ) )
            // InternalBlocXML.g:391:4: (lv_compoIdf_5_0= RULE_STRING )
            {
            // InternalBlocXML.g:391:4: (lv_compoIdf_5_0= RULE_STRING )
            // InternalBlocXML.g:392:5: lv_compoIdf_5_0= RULE_STRING
            {
            lv_compoIdf_5_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_compoIdf_5_0, grammarAccess.getComponentAccess().getCompoIdfSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"compoIdf",
            						lv_compoIdf_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getIDTKeyword_6());
            		
            // InternalBlocXML.g:412:3: ( (lv_compoIdt_7_0= RULE_STRING ) )
            // InternalBlocXML.g:413:4: (lv_compoIdt_7_0= RULE_STRING )
            {
            // InternalBlocXML.g:413:4: (lv_compoIdt_7_0= RULE_STRING )
            // InternalBlocXML.g:414:5: lv_compoIdt_7_0= RULE_STRING
            {
            lv_compoIdt_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_compoIdt_7_0, grammarAccess.getComponentAccess().getCompoIdtSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"compoIdt",
            						lv_compoIdt_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getGreaterThanSignKeyword_8());
            		
            // InternalBlocXML.g:434:3: ( (lv_vars_9_0= ruleVariable ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBlocXML.g:435:4: (lv_vars_9_0= ruleVariable )
            	    {
            	    // InternalBlocXML.g:435:4: (lv_vars_9_0= ruleVariable )
            	    // InternalBlocXML.g:436:5: lv_vars_9_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getVarsVariableParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_vars_9_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vars",
            	    						lv_vars_9_0,
            	    						"org.xtext.example.BlocXML.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_10=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getComponentKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleVariable"
    // InternalBlocXML.g:461:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalBlocXML.g:461:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalBlocXML.g:462:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalBlocXML.g:468:1: ruleVariable returns [EObject current=null] : (otherlv_0= '<variable_type Name=' ( (lv_varName_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_tags_3_0= ruleTag ) )* otherlv_4= '</variable_type>' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tags_3_0 = null;



        	enterRule();

        try {
            // InternalBlocXML.g:474:2: ( (otherlv_0= '<variable_type Name=' ( (lv_varName_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_tags_3_0= ruleTag ) )* otherlv_4= '</variable_type>' ) )
            // InternalBlocXML.g:475:2: (otherlv_0= '<variable_type Name=' ( (lv_varName_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_tags_3_0= ruleTag ) )* otherlv_4= '</variable_type>' )
            {
            // InternalBlocXML.g:475:2: (otherlv_0= '<variable_type Name=' ( (lv_varName_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_tags_3_0= ruleTag ) )* otherlv_4= '</variable_type>' )
            // InternalBlocXML.g:476:3: otherlv_0= '<variable_type Name=' ( (lv_varName_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_tags_3_0= ruleTag ) )* otherlv_4= '</variable_type>'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariable_typeNameKeyword_0());
            		
            // InternalBlocXML.g:480:3: ( (lv_varName_1_0= RULE_STRING ) )
            // InternalBlocXML.g:481:4: (lv_varName_1_0= RULE_STRING )
            {
            // InternalBlocXML.g:481:4: (lv_varName_1_0= RULE_STRING )
            // InternalBlocXML.g:482:5: lv_varName_1_0= RULE_STRING
            {
            lv_varName_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_varName_1_0, grammarAccess.getVariableAccess().getVarNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getGreaterThanSignKeyword_2());
            		
            // InternalBlocXML.g:502:3: ( (lv_tags_3_0= ruleTag ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBlocXML.g:503:4: (lv_tags_3_0= ruleTag )
            	    {
            	    // InternalBlocXML.g:503:4: (lv_tags_3_0= ruleTag )
            	    // InternalBlocXML.g:504:5: lv_tags_3_0= ruleTag
            	    {

            	    					newCompositeNode(grammarAccess.getVariableAccess().getTagsTagParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_tags_3_0=ruleTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVariableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tags",
            	    						lv_tags_3_0,
            	    						"org.xtext.example.BlocXML.Tag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getVariable_typeKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleTag"
    // InternalBlocXML.g:529:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalBlocXML.g:529:44: (iv_ruleTag= ruleTag EOF )
            // InternalBlocXML.g:530:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalBlocXML.g:536:1: ruleTag returns [EObject current=null] : (otherlv_0= '<t' ( (lv_tagNum_1_0= RULE_INT ) ) otherlv_2= ' Name=' ( (lv_tagName_3_0= RULE_STRING ) ) otherlv_4= '>' ( ( (lv_var_5_0= RULE_ID ) ) | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT )? otherlv_8= '</t' ( (lv_tagNum_9_0= RULE_INT ) ) otherlv_10= '>' ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_tagNum_1_0=null;
        Token otherlv_2=null;
        Token lv_tagName_3_0=null;
        Token otherlv_4=null;
        Token lv_var_5_0=null;
        Token this_STRING_6=null;
        Token this_INT_7=null;
        Token otherlv_8=null;
        Token lv_tagNum_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalBlocXML.g:542:2: ( (otherlv_0= '<t' ( (lv_tagNum_1_0= RULE_INT ) ) otherlv_2= ' Name=' ( (lv_tagName_3_0= RULE_STRING ) ) otherlv_4= '>' ( ( (lv_var_5_0= RULE_ID ) ) | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT )? otherlv_8= '</t' ( (lv_tagNum_9_0= RULE_INT ) ) otherlv_10= '>' ) )
            // InternalBlocXML.g:543:2: (otherlv_0= '<t' ( (lv_tagNum_1_0= RULE_INT ) ) otherlv_2= ' Name=' ( (lv_tagName_3_0= RULE_STRING ) ) otherlv_4= '>' ( ( (lv_var_5_0= RULE_ID ) ) | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT )? otherlv_8= '</t' ( (lv_tagNum_9_0= RULE_INT ) ) otherlv_10= '>' )
            {
            // InternalBlocXML.g:543:2: (otherlv_0= '<t' ( (lv_tagNum_1_0= RULE_INT ) ) otherlv_2= ' Name=' ( (lv_tagName_3_0= RULE_STRING ) ) otherlv_4= '>' ( ( (lv_var_5_0= RULE_ID ) ) | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT )? otherlv_8= '</t' ( (lv_tagNum_9_0= RULE_INT ) ) otherlv_10= '>' )
            // InternalBlocXML.g:544:3: otherlv_0= '<t' ( (lv_tagNum_1_0= RULE_INT ) ) otherlv_2= ' Name=' ( (lv_tagName_3_0= RULE_STRING ) ) otherlv_4= '>' ( ( (lv_var_5_0= RULE_ID ) ) | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT )? otherlv_8= '</t' ( (lv_tagNum_9_0= RULE_INT ) ) otherlv_10= '>'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getTagAccess().getTKeyword_0());
            		
            // InternalBlocXML.g:548:3: ( (lv_tagNum_1_0= RULE_INT ) )
            // InternalBlocXML.g:549:4: (lv_tagNum_1_0= RULE_INT )
            {
            // InternalBlocXML.g:549:4: (lv_tagNum_1_0= RULE_INT )
            // InternalBlocXML.g:550:5: lv_tagNum_1_0= RULE_INT
            {
            lv_tagNum_1_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_tagNum_1_0, grammarAccess.getTagAccess().getTagNumINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tagNum",
            						lv_tagNum_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getTagAccess().getNameKeyword_2());
            		
            // InternalBlocXML.g:570:3: ( (lv_tagName_3_0= RULE_STRING ) )
            // InternalBlocXML.g:571:4: (lv_tagName_3_0= RULE_STRING )
            {
            // InternalBlocXML.g:571:4: (lv_tagName_3_0= RULE_STRING )
            // InternalBlocXML.g:572:5: lv_tagName_3_0= RULE_STRING
            {
            lv_tagName_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_tagName_3_0, grammarAccess.getTagAccess().getTagNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tagName",
            						lv_tagName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getTagAccess().getGreaterThanSignKeyword_4());
            		
            // InternalBlocXML.g:592:3: ( ( (lv_var_5_0= RULE_ID ) ) | this_STRING_6= RULE_STRING | this_INT_7= RULE_INT )?
            int alt11=4;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt11=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt11=2;
                    }
                    break;
                case RULE_INT:
                    {
                    alt11=3;
                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // InternalBlocXML.g:593:4: ( (lv_var_5_0= RULE_ID ) )
                    {
                    // InternalBlocXML.g:593:4: ( (lv_var_5_0= RULE_ID ) )
                    // InternalBlocXML.g:594:5: (lv_var_5_0= RULE_ID )
                    {
                    // InternalBlocXML.g:594:5: (lv_var_5_0= RULE_ID )
                    // InternalBlocXML.g:595:6: lv_var_5_0= RULE_ID
                    {
                    lv_var_5_0=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(lv_var_5_0, grammarAccess.getTagAccess().getVarIDTerminalRuleCall_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTagRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"var",
                    							lv_var_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBlocXML.g:612:4: this_STRING_6= RULE_STRING
                    {
                    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    				newLeafNode(this_STRING_6, grammarAccess.getTagAccess().getSTRINGTerminalRuleCall_5_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalBlocXML.g:617:4: this_INT_7= RULE_INT
                    {
                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_26); 

                    				newLeafNode(this_INT_7, grammarAccess.getTagAccess().getINTTerminalRuleCall_5_2());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,35,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getTagAccess().getTKeyword_6());
            		
            // InternalBlocXML.g:626:3: ( (lv_tagNum_9_0= RULE_INT ) )
            // InternalBlocXML.g:627:4: (lv_tagNum_9_0= RULE_INT )
            {
            // InternalBlocXML.g:627:4: (lv_tagNum_9_0= RULE_INT )
            // InternalBlocXML.g:628:5: lv_tagNum_9_0= RULE_INT
            {
            lv_tagNum_9_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_tagNum_9_0, grammarAccess.getTagAccess().getTagNumINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tagNum",
            						lv_tagNum_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTagAccess().getGreaterThanSignKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleNodes"
    // InternalBlocXML.g:652:1: entryRuleNodes returns [EObject current=null] : iv_ruleNodes= ruleNodes EOF ;
    public final EObject entryRuleNodes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodes = null;


        try {
            // InternalBlocXML.g:652:46: (iv_ruleNodes= ruleNodes EOF )
            // InternalBlocXML.g:653:2: iv_ruleNodes= ruleNodes EOF
            {
             newCompositeNode(grammarAccess.getNodesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodes=ruleNodes();

            state._fsp--;

             current =iv_ruleNodes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodes"


    // $ANTLR start "ruleNodes"
    // InternalBlocXML.g:659:1: ruleNodes returns [EObject current=null] : (otherlv_0= '<nodes>' ( (lv_nodes_1_0= ruleNode ) )* otherlv_2= '</nodes>' ) ;
    public final EObject ruleNodes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_nodes_1_0 = null;



        	enterRule();

        try {
            // InternalBlocXML.g:665:2: ( (otherlv_0= '<nodes>' ( (lv_nodes_1_0= ruleNode ) )* otherlv_2= '</nodes>' ) )
            // InternalBlocXML.g:666:2: (otherlv_0= '<nodes>' ( (lv_nodes_1_0= ruleNode ) )* otherlv_2= '</nodes>' )
            {
            // InternalBlocXML.g:666:2: (otherlv_0= '<nodes>' ( (lv_nodes_1_0= ruleNode ) )* otherlv_2= '</nodes>' )
            // InternalBlocXML.g:667:3: otherlv_0= '<nodes>' ( (lv_nodes_1_0= ruleNode ) )* otherlv_2= '</nodes>'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getNodesAccess().getNodesKeyword_0());
            		
            // InternalBlocXML.g:671:3: ( (lv_nodes_1_0= ruleNode ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBlocXML.g:672:4: (lv_nodes_1_0= ruleNode )
            	    {
            	    // InternalBlocXML.g:672:4: (lv_nodes_1_0= ruleNode )
            	    // InternalBlocXML.g:673:5: lv_nodes_1_0= ruleNode
            	    {

            	    					newCompositeNode(grammarAccess.getNodesAccess().getNodesNodeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_nodes_1_0=ruleNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_1_0,
            	    						"org.xtext.example.BlocXML.Node");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_2=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getNodesAccess().getNodesKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodes"


    // $ANTLR start "entryRuleNode"
    // InternalBlocXML.g:698:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalBlocXML.g:698:45: (iv_ruleNode= ruleNode EOF )
            // InternalBlocXML.g:699:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalBlocXML.g:705:1: ruleNode returns [EObject current=null] : (otherlv_0= '<node Name=' ( (lv_nodeName_1_0= RULE_STRING ) ) otherlv_2= ' Technology=\"Bloc\">' ( (lv_links_3_0= ruleLink ) )* otherlv_4= '</node>' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nodeName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_links_3_0 = null;



        	enterRule();

        try {
            // InternalBlocXML.g:711:2: ( (otherlv_0= '<node Name=' ( (lv_nodeName_1_0= RULE_STRING ) ) otherlv_2= ' Technology=\"Bloc\">' ( (lv_links_3_0= ruleLink ) )* otherlv_4= '</node>' ) )
            // InternalBlocXML.g:712:2: (otherlv_0= '<node Name=' ( (lv_nodeName_1_0= RULE_STRING ) ) otherlv_2= ' Technology=\"Bloc\">' ( (lv_links_3_0= ruleLink ) )* otherlv_4= '</node>' )
            {
            // InternalBlocXML.g:712:2: (otherlv_0= '<node Name=' ( (lv_nodeName_1_0= RULE_STRING ) ) otherlv_2= ' Technology=\"Bloc\">' ( (lv_links_3_0= ruleLink ) )* otherlv_4= '</node>' )
            // InternalBlocXML.g:713:3: otherlv_0= '<node Name=' ( (lv_nodeName_1_0= RULE_STRING ) ) otherlv_2= ' Technology=\"Bloc\">' ( (lv_links_3_0= ruleLink ) )* otherlv_4= '</node>'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeNameKeyword_0());
            		
            // InternalBlocXML.g:717:3: ( (lv_nodeName_1_0= RULE_STRING ) )
            // InternalBlocXML.g:718:4: (lv_nodeName_1_0= RULE_STRING )
            {
            // InternalBlocXML.g:718:4: (lv_nodeName_1_0= RULE_STRING )
            // InternalBlocXML.g:719:5: lv_nodeName_1_0= RULE_STRING
            {
            lv_nodeName_1_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_nodeName_1_0, grammarAccess.getNodeAccess().getNodeNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nodeName",
            						lv_nodeName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getTechnologyBlocKeyword_2());
            		
            // InternalBlocXML.g:739:3: ( (lv_links_3_0= ruleLink ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBlocXML.g:740:4: (lv_links_3_0= ruleLink )
            	    {
            	    // InternalBlocXML.g:740:4: (lv_links_3_0= ruleLink )
            	    // InternalBlocXML.g:741:5: lv_links_3_0= ruleLink
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getLinksLinkParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_links_3_0=ruleLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"links",
            	    						lv_links_3_0,
            	    						"org.xtext.example.BlocXML.Link");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getNodeKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleLink"
    // InternalBlocXML.g:766:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalBlocXML.g:766:45: (iv_ruleLink= ruleLink EOF )
            // InternalBlocXML.g:767:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalBlocXML.g:773:1: ruleLink returns [EObject current=null] : (otherlv_0= '<link CompID=' ( (lv_CompID_1_0= RULE_STRING ) ) otherlv_2= ' PortID=' ( (lv_portID_3_0= RULE_STRING ) ) otherlv_4= ' PortName=' ( (lv_portName_5_0= RULE_STRING ) ) otherlv_6= ' PortDirection=' ( (lv_portName2_7_0= RULE_STRING ) ) ( (lv_baliseFermante_8_0= ruleBalise ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_CompID_1_0=null;
        Token otherlv_2=null;
        Token lv_portID_3_0=null;
        Token otherlv_4=null;
        Token lv_portName_5_0=null;
        Token otherlv_6=null;
        Token lv_portName2_7_0=null;
        AntlrDatatypeRuleToken lv_baliseFermante_8_0 = null;



        	enterRule();

        try {
            // InternalBlocXML.g:779:2: ( (otherlv_0= '<link CompID=' ( (lv_CompID_1_0= RULE_STRING ) ) otherlv_2= ' PortID=' ( (lv_portID_3_0= RULE_STRING ) ) otherlv_4= ' PortName=' ( (lv_portName_5_0= RULE_STRING ) ) otherlv_6= ' PortDirection=' ( (lv_portName2_7_0= RULE_STRING ) ) ( (lv_baliseFermante_8_0= ruleBalise ) ) ) )
            // InternalBlocXML.g:780:2: (otherlv_0= '<link CompID=' ( (lv_CompID_1_0= RULE_STRING ) ) otherlv_2= ' PortID=' ( (lv_portID_3_0= RULE_STRING ) ) otherlv_4= ' PortName=' ( (lv_portName_5_0= RULE_STRING ) ) otherlv_6= ' PortDirection=' ( (lv_portName2_7_0= RULE_STRING ) ) ( (lv_baliseFermante_8_0= ruleBalise ) ) )
            {
            // InternalBlocXML.g:780:2: (otherlv_0= '<link CompID=' ( (lv_CompID_1_0= RULE_STRING ) ) otherlv_2= ' PortID=' ( (lv_portID_3_0= RULE_STRING ) ) otherlv_4= ' PortName=' ( (lv_portName_5_0= RULE_STRING ) ) otherlv_6= ' PortDirection=' ( (lv_portName2_7_0= RULE_STRING ) ) ( (lv_baliseFermante_8_0= ruleBalise ) ) )
            // InternalBlocXML.g:781:3: otherlv_0= '<link CompID=' ( (lv_CompID_1_0= RULE_STRING ) ) otherlv_2= ' PortID=' ( (lv_portID_3_0= RULE_STRING ) ) otherlv_4= ' PortName=' ( (lv_portName_5_0= RULE_STRING ) ) otherlv_6= ' PortDirection=' ( (lv_portName2_7_0= RULE_STRING ) ) ( (lv_baliseFermante_8_0= ruleBalise ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkCompIDKeyword_0());
            		
            // InternalBlocXML.g:785:3: ( (lv_CompID_1_0= RULE_STRING ) )
            // InternalBlocXML.g:786:4: (lv_CompID_1_0= RULE_STRING )
            {
            // InternalBlocXML.g:786:4: (lv_CompID_1_0= RULE_STRING )
            // InternalBlocXML.g:787:5: lv_CompID_1_0= RULE_STRING
            {
            lv_CompID_1_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_CompID_1_0, grammarAccess.getLinkAccess().getCompIDSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"CompID",
            						lv_CompID_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getPortIDKeyword_2());
            		
            // InternalBlocXML.g:807:3: ( (lv_portID_3_0= RULE_STRING ) )
            // InternalBlocXML.g:808:4: (lv_portID_3_0= RULE_STRING )
            {
            // InternalBlocXML.g:808:4: (lv_portID_3_0= RULE_STRING )
            // InternalBlocXML.g:809:5: lv_portID_3_0= RULE_STRING
            {
            lv_portID_3_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_portID_3_0, grammarAccess.getLinkAccess().getPortIDSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"portID",
            						lv_portID_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getPortNameKeyword_4());
            		
            // InternalBlocXML.g:829:3: ( (lv_portName_5_0= RULE_STRING ) )
            // InternalBlocXML.g:830:4: (lv_portName_5_0= RULE_STRING )
            {
            // InternalBlocXML.g:830:4: (lv_portName_5_0= RULE_STRING )
            // InternalBlocXML.g:831:5: lv_portName_5_0= RULE_STRING
            {
            lv_portName_5_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_portName_5_0, grammarAccess.getLinkAccess().getPortNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"portName",
            						lv_portName_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,44,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getPortDirectionKeyword_6());
            		
            // InternalBlocXML.g:851:3: ( (lv_portName2_7_0= RULE_STRING ) )
            // InternalBlocXML.g:852:4: (lv_portName2_7_0= RULE_STRING )
            {
            // InternalBlocXML.g:852:4: (lv_portName2_7_0= RULE_STRING )
            // InternalBlocXML.g:853:5: lv_portName2_7_0= RULE_STRING
            {
            lv_portName2_7_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_portName2_7_0, grammarAccess.getLinkAccess().getPortName2STRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"portName2",
            						lv_portName2_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBlocXML.g:869:3: ( (lv_baliseFermante_8_0= ruleBalise ) )
            // InternalBlocXML.g:870:4: (lv_baliseFermante_8_0= ruleBalise )
            {
            // InternalBlocXML.g:870:4: (lv_baliseFermante_8_0= ruleBalise )
            // InternalBlocXML.g:871:5: lv_baliseFermante_8_0= ruleBalise
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getBaliseFermanteBaliseParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_baliseFermante_8_0=ruleBalise();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"baliseFermante",
            						lv_baliseFermante_8_0,
            						"org.xtext.example.BlocXML.Balise");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleBalise"
    // InternalBlocXML.g:892:1: entryRuleBalise returns [String current=null] : iv_ruleBalise= ruleBalise EOF ;
    public final String entryRuleBalise() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBalise = null;


        try {
            // InternalBlocXML.g:892:46: (iv_ruleBalise= ruleBalise EOF )
            // InternalBlocXML.g:893:2: iv_ruleBalise= ruleBalise EOF
            {
             newCompositeNode(grammarAccess.getBaliseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBalise=ruleBalise();

            state._fsp--;

             current =iv_ruleBalise.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBalise"


    // $ANTLR start "ruleBalise"
    // InternalBlocXML.g:899:1: ruleBalise returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/>' ;
    public final AntlrDatatypeRuleToken ruleBalise() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBlocXML.g:905:2: (kw= '/>' )
            // InternalBlocXML.g:906:2: kw= '/>'
            {
            kw=(Token)match(input,45,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBaliseAccess().getSolidusGreaterThanSignKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBalise"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000070L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});

}