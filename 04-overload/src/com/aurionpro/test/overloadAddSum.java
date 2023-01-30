package com.aurionpro.test;

public class overloadAddSum {
	public static void main(String[] args) {
		System.out.println(addNumbers(10, 10.5));
	}

	private static double addNumbers(int i, double d) {
		return i+d; 
	}
}
