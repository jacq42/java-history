package de.jkrech.tutorial.version11;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.junit.jupiter.api.Test;

class ImprovedPredicateTest {

	private ImprovedPredicate improvedPredicate = new ImprovedPredicate();
	
	@Test
	void shouldDeleteBlanks() {
		List<String> dirtyList = Arrays.asList("eins", " ", "", "zwei", "\n", "drei");
		List<String> expectedItems = Arrays.asList("eins", "zwei", "drei");
		assertTrue(Objects.deepEquals(expectedItems, improvedPredicate.deleteBlanks(dirtyList)));
	}
}
