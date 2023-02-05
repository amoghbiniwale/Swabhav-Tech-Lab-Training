package com.aurionpro.test;

public class MinMax {
	public int max(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public int min(int[]arr) {
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]< min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int [] myArr = {10,20,30,50,70,22};
		MinMax m = new MinMax();
		System.out.println("minimum value is:"+m.min(myArr));
		System.out.println("miximum value is:"+m.max(myArr));
	}
}