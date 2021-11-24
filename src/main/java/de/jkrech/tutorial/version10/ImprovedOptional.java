package de.jkrech.tutorial.version10;

import java.util.Optional;
import java.util.function.Predicate;

public class ImprovedOptional {

	public String nonBlank(String value) {
		return Optional.ofNullable(value)
				.filter(Predicate.not(String::isBlank))
				.orElseThrow();
	}
}
