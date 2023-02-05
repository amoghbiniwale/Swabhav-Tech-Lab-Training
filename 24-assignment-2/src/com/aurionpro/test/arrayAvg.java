package com.aurionpro.test;

public class arrayAvg {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		int sum =0;
		float avg =0.0f;
		
		//sum of array
		for(int i =0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		//average
		avg = sum / arr.length;
		
		System.out.println("average of array is:"+avg);
	}

}
