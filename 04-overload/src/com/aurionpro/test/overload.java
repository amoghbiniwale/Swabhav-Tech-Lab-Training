package com.aurionpro.test;

public class overload {

	public static void main(String[] args) {
		printInfo(10);
		printInfo("amogh");
		printInfo(180.55);
		
		System.out.println();
	}

	private static void printInfo(double d) {
		System.out.println(d);
	}

	private static void printInfo(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
		
	}

	private static void printInfo(String string) {
		System.out.println(string);
	}
	
}
