package de.jkrech.tutorial.version10;

import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiableCollections {

	public List<String> copyOf(List<String> list) {
		return List.copyOf(list);
	}

	public List<String> makeUnmodifiable(List<String> list) {
		return list.stream()
				.collect(Collectors.toUnmodifiableList());
	}
}
