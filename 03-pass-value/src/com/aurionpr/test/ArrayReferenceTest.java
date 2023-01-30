package com.aurionpr.test;

public class ArrayReferenceTest {

	public static void main(String[] args) {
		int[]  numbers= {10,20,30,40};
		ConvertNumberToZero(numbers);
		for(int i = 0 ; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
		
	private static void ConvertNumberToZero(int[] numbers) {
			for(int i = 0 ; i<numbers.length;i++) {
				numbers[i]=0;
			}
		}

	}

