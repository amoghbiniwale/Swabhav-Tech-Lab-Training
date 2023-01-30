package com.aurionpro.test;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 10, 30, 50, 40, 20 };
		int temp;
		for (int i = 0; i < a.length; i++) { // rounds
			for (int j = 0; j < a.length-1; j++) { // near element
				if (a[j] > a[j + 1]) { // if 1st number is bigger swap them
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) { // printing array with sorted format
			System.out.println(a[i]+"");
		}

	}

}
