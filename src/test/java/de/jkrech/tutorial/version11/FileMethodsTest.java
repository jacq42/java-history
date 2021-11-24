package de.jkrech.tutorial.version11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FileMethodsTest {

	private FileMethods fileMethods = new FileMethods();
	
	@Test
	void shouldReturnFileContent() throws Exception {
		assertEquals("Sample text", fileMethods.name());
	}
}
