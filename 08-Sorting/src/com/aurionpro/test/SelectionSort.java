package com.aurionpro.test;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = { 38, 55, 9, 62, 13, 77, 59 };
		int temp =0;
		int min;
		for (int i = 0; i < a.length; i++) {
			 min = i;
			for (int j = i + 1; j < a.length; j++) { //search for smallest element form 2nd index
				if (a[j] < a[min]) {
					min = j;
				}
			}
			//swap smallest element with 1st index
			temp =a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]+"");
		}
			
	}
}
