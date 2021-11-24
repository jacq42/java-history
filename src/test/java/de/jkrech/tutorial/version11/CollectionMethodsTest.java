package de.jkrech.tutorial.version11;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Objects;

import org.junit.jupiter.api.Test;

class CollectionMethodsTest {

	private CollectionMethods collectionMethods = new CollectionMethods();
	
	@Test
	void shouldReturnListAsArray() {
		String[] expectedArray = new String[] {"eins", "zwei", "drei"};
		assertTrue(Objects.deepEquals(expectedArray, collectionMethods.convertToArray(Arrays.asList("eins", "zwei", "drei"))));
	}
}
