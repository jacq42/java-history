package de.jkrech.tutorial.version10;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class UnmodifiableCollectionsTest {

	private UnmodifiableCollections unmodifiableCollections = new UnmodifiableCollections();
	
	@Test
	void shouldThrowAnExceptionWhenCopy() {
		List<String> modifiableList = modifiableList();
		
		List<String> unmodifiableList = unmodifiableCollections.copyOf(modifiableList);
		
		assertThrows(UnsupportedOperationException.class, () -> unmodifiableList.add("drei"));
	}
	
	@Test
	void shouldThrowAnExceptionWhenMakeCollect() {
		List<String> modifiableList = modifiableList();
		
		List<String> unmodifiableList = unmodifiableCollections.makeUnmodifiable(modifiableList);
		
		assertThrows(UnsupportedOperationException.class, () -> unmodifiableList.add("drei"));
	}
	
	private List<String> modifiableList() {
		List<String> modifiableList = new ArrayList<>();
		modifiableList.add("eins");
		modifiableList.add("zwei");
		return modifiableList;
	}
}
