package com.aurionpro.test;

public class ArrayMedian {

	public static void main(String[] args) {
		int arr[] = { 0, 5, 2, 8, 4};
		int median = 0;
		int n = arr.length;

		if (n % 2 == 1) {
			median = arr[(n + 1) / 2 - 1];
		} else {
			median = (arr[n / 2 - 1] + arr[n / 2]) / 2;
		}
		System.out.println("Median: " + median);
	}

}
