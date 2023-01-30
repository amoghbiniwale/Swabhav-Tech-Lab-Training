package com.aurionpr.test;

import java.util.*;

public class reverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of array");
		int n = sc.nextInt();

		int a[] = new int[n];
		System.out.println("enter array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("reverse array: ");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}

	}

}
