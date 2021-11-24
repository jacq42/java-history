package de.jkrech.tutorial.version10;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class ImprovedOptionalTest {

	private ImprovedOptional improvedOptional = new ImprovedOptional();
	
	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = { " " })
	void shouldThrowAnException(String value) {
		assertThrows(NoSuchElementException.class, () -> improvedOptional.nonBlank(value));
	}
}
