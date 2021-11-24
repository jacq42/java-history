package de.jkrech.tutorial.version10;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LocalVariableTypeReferenceTest {

	@Test
	void shouldInferType() {
		var message = "Dies ist ein Test";
		assertTrue(message instanceof String);
	}
}
