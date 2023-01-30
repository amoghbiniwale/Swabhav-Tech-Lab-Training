package com.aurionpro.test;

import java.util.*;

public class Rides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total = 0, fare = 0;

		System.out.println("enter your height");
		int option = sc.nextInt();

		if (option > 120) {
			System.out.println("you can ride");
			System.out.println("enter your age");
			int age = sc.nextInt();
			if (age <= 12) {
				fare = 5;
				System.out.println("+$5");
			} else if (age >= 12 && age <= 18) {
				fare = 7;
				System.out.println("+$7");
			} else if (age >= 18 && age <= 45) {
				fare = 12;
				System.out.println("+$12");
			} else if (age >= 45 && age <= 55) {
				fare = 3;
				System.out.println("+$3");
			} else {
				System.out.println("its free");
			}
			System.out.println("if you want photos");
			String photos = sc.next();

			if (photos.equalsIgnoreCase("yes")) {

				total = fare + 3;
				System.out.println("+$3");
			} else {
				total = fare;
			}
			System.out.println("total bill... $" + total);
		}

		else {
			System.out.println("cant ride");
		}
	}

}