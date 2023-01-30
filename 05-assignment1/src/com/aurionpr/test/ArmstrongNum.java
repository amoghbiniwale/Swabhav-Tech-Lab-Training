package com.aurionpr.test;

import java.util.*;

public class ArmstrongNum {

	public static void main(String[] args) {
		int num, temp = 0, remainder, result = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		num = sc.nextInt();

		temp = num;
		while (temp != 0) {
			remainder = temp % 10;
			result += Math.pow(remainder, 3);
			temp /= 10;

		}
		if (result == num) {
			System.out.println(num + " is an armstrong number");
		} else {
			System.out.println(num + "is not armstrong number");
		}

	}

}
