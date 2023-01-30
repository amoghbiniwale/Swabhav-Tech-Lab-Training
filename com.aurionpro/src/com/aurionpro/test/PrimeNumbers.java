package com.aurionpro.test;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int x=0;
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				x = x + 1;
			}
		}
		if (x > 0) {
			System.out.println("not prime");
		} else {
			System.out.println("prime");
		}
	}
}