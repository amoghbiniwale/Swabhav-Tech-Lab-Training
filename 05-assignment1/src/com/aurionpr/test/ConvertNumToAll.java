package com.aurionpr.test;

import java.util.Scanner;

public class ConvertNumToAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		
		String binary,octal,hexadecimal;
		
		binary = Integer.toBinaryString(num);
		octal = Integer.toOctalString(num);
		hexadecimal = Integer.toHexString(num);
		
		System.out.println("binary is: "+binary+ " octal is: "+octal+" hexadecimal is : "+hexadecimal);
		
		
		
		

	}
}
