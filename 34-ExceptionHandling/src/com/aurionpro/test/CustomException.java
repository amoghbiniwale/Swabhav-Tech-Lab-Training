package com.aurionpro.test;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class CustomException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age: ");
		int age = sc.nextInt();
		try {
			validateAge(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("program end");
		
	}

	private static void validateAge(int age) throws InvalidAgeException {
		if(age > 18) {
			System.out.println("eligible for voting");
		}
		else {
			throw new InvalidAgeException("under age");
		}
	}

}
