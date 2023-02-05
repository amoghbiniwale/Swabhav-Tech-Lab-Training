package com.aurionpro.test;

import java.util.Scanner;


public class arraySumTest {

	public static void main(String[] args) {
		System.out.println("enter the size of array:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int array[] = new int[size];
		int sum =0;
		System.out.println("enter array:");
		
		for(int i =0;i<size;i++) {
			array[i] =sc.nextInt();
			sum = sum+array[i];		
		}
		System.out.println("sum of array:"+sum);
		
	}
}
