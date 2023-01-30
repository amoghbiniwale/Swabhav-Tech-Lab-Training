package com.aurionpr.test;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number =sc.nextInt();
		int x = 0;
		
		for(int i=2 ; i<= number-1; i++ ) {
			if(number%i==0) {
				x=x+1;
			}
		}
		if(x == 0) {
			System.out.println(number+" number is prime");
		}
		else {
			System.out.println(number+" number is not prime");
		}
	}
	
	

}
