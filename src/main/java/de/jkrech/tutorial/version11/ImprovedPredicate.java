package de.jkrech.tutorial.version11;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ImprovedPredicate {

	public List<String> deleteBlanks(List<String> sampleList) {
		return sampleList.stream()
		  .filter(Predicate.not(String::isBlank))
		  .collect(Collectors.toList());
	}
}
