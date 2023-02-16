package com.aurionpro.model;

public class Unchecked {
	public static void main(String[] args) {
		method1();
		System.out.println("in main");
	}

	private static void method1() {
		method2();
		System.out.println("in method 1");
	}

	private static void method2() {
		method3();
		System.out.println("in method 2");
	}

	private static void method3() {
		throw new RuntimeException("an exceptin occored");
	}

}
