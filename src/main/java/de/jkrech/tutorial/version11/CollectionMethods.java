package de.jkrech.tutorial.version11;

import java.util.List;

public class CollectionMethods {

	public String[] convertToArray(List<String> list) {
		return list.toArray(String[]::new);
	}
}
