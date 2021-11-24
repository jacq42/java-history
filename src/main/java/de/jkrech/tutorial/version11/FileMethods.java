package de.jkrech.tutorial.version11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * We can use the new readString and writeString static methods from the Files class:
 */
public class FileMethods {

	public String name() throws IOException {
		var tempFile = Files.createTempFile(Path.of("/tmp"), "demo", ".txt");
		var filePath = Files.writeString(tempFile, "Sample text");
		return Files.readString(filePath);
	}
}
