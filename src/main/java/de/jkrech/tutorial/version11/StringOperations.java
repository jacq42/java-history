package de.jkrech.tutorial.version11;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Java 11 adds a few new methods to the String class: 
 * isBlank, lines, strip, stripLeading, stripTrailing, and repeat.
 */
public class StringOperations {

	public List<String> multilineString() {
		var multiline = "Dies ist ein String\n der über mehrere\n Zeilen geht.";
		
		return multiline.lines()
		.filter(line -> !line.isBlank())
		.map(String::strip)
		.collect(Collectors.toList());
	}
	
	public String repeat(int times) {
		return "abc_".repeat(times);
	}
}
