package com.aurionpro.test;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class VoteValidate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age: ");
		int age = sc.nextInt();
		validateAge(age);
		
	}

	private static void validateAge(int age) {
		if(age > 18) {
			System.out.println("eligible for voting");
		}
		else {
			throw new RuntimeException("under age");
		}
	}

}
