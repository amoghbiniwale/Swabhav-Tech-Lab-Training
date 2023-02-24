package com.aurionpro.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileStreams {

	public static void main(String[] args) {
		String fileName = "D:\\\\java\\\\swabhavTech\\\\50-Streams-HomeWork\\\\text.txt";
		//read file into stream, try-with-resources
	    try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

	      stream.forEach(System.out::println);

	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}

}
