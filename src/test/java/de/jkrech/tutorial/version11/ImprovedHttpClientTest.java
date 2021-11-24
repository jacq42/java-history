package de.jkrech.tutorial.version11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ImprovedHttpClientTest {

	private ImprovedHttpClient improvedHttpClient = new ImprovedHttpClient();
	
	@Test
	void shouldHandleHttpRequests() throws Exception {
		assertEquals(200, improvedHttpClient.get());
	}
}
