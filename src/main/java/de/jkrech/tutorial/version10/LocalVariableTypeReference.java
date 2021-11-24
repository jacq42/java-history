package de.jkrech.tutorial.version10;

/**
 * Note that this feature is available only for local variables with the initializer. 
 * It cannot be used for member variables, method parameters, return types, etc – the initializer 
 * is required as without which compiler won't be able to infer the type.
 * 
 * <br/><br/>
 * 
 * Helps:
 * <ul>
 * <li>in reducing the boilerplate code</li>
 * <li>to focus on the variable name rather than on the variable type</li>
 * </ul>
 * 
 * <br/><br/>
 * 
 * Finally, note that there is no runtime overhead in using var nor does it make Java a dynamically typed language. 
 * The type of the variable is still inferred at compile time and cannot be changed later.
 * 
 */
public class LocalVariableTypeReference {

	public Class<?> classOf() {
		var message = "Dies ist ein Test";
		return message.getClass();
	}
}
