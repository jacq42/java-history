package de.jkrech.tutorial.version11;

import java.util.jar.Pack200;

import jdk.nashorn.api.scripting.NashornScriptEngine;

/**
 * Removed some Java EE and CORBA Modules:
 * <ul>
 * <li>Java API for XML-Based Web Services (java.xml.ws)</li>
 * <li>Java Architecture for XML Binding (java.xml.bind)</li>
 * <li>JavaBeans Activation Framework (java.activation)</li>
 * <li>Common Annotations (java.xml.ws.annotation)</li>
 * <li>Common Object Request Broker Architecture (java.corba)</li>
 * <li>JavaTransaction API (java.transaction)</li>
 * </ul>
 * 
 * Moved JDK Mission Control (JMC) to a standalone version (separate download).
 * 
 * Moved JavaFX to a separate set of modules outside of the JDK.
 * 
 * Deprecated:
 * <ul>
 * <li>Nashorn Engine</li>
 * <li>Pack200 compression</li>
 * </ul>
 */
public class DeprecatedAndRemovedThings {
	
	NashornScriptEngine nashorn = null;
	Pack200 compression = null;

}
