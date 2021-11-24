package de.jkrech.tutorial.version11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class ImprovedHttpClient {

	public int get() throws IOException, InterruptedException {
		var httpClient = HttpClient.newBuilder()
				.version(HttpClient.Version.HTTP_2)
				.connectTimeout(Duration.ofSeconds(20))
				.build();
		
		var httpRequest = HttpRequest.newBuilder()
				.GET().uri(URI.create("http://www.example.com/"))
				.build();
		
		var httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		
		return httpResponse.statusCode();
	}
}
