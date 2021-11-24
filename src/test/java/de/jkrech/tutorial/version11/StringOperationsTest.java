package de.jkrech.tutorial.version11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.junit.jupiter.api.Test;

class StringOperationsTest {

	private StringOperations stringOperations = new StringOperations();
	
	@Test
	void shouldReturnExtractedMultilineString() {
		List<String> expectedLines = Arrays.asList("Dies ist ein String", "der über mehrere", "Zeilen geht.");
		
		assertTrue(Objects.deepEquals(expectedLines, stringOperations.multilineString()));
	}
	
	@Test
	void shouldRepeatString() {
		assertEquals("abc_abc_abc_", stringOperations.repeat(3));
	}
}
