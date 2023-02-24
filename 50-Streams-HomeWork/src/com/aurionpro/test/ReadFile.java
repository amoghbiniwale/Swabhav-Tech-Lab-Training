package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		int ch;
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("D:\\java\\swabhavTech\\50-Streams-HomeWork\\text.txt");
			
		}catch (FileNotFoundException fe) {
		      System.out.println("File not found");
	    }
		
		while ((ch = fileReader.read()) != -1)
		      System.out.print((char) ch);

		fileReader.close();
	}

}
