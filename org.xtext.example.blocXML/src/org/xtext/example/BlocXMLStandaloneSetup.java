/*
 * generated by Xtext 2.29.0
 */
package org.xtext.example;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class BlocXMLStandaloneSetup extends BlocXMLStandaloneSetupGenerated {

	public static void doSetup() {
		new BlocXMLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
