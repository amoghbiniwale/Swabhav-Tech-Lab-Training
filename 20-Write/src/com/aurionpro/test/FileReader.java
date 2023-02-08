package com.aurionpro.test;

import java.io.File;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args)throws Exception {
		// pass the path to the file as a parameter
	    File file = new File("C:\\Users\\amogh biniwale\\gitToken.txt");
	    Scanner sc = new Scanner(file);
	 
	    while (sc.hasNextLine())
	      System.out.println(sc.nextLine());
	      
	      //do it fast
	}
}
