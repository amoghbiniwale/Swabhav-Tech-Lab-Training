package com.aurionpro.test;
import java.util.*;

public class Tresure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("welcome to tresure island");
		System.out.println("left or right");
		String option = sc.next();
		
		if(option.equalsIgnoreCase("left")) {
			System.out.println(" swim or wait");
			option = sc.next();			
			if(option.equalsIgnoreCase("wait")) {
				System.out.println("which door?");
				option=sc.next();				
				if(option.equalsIgnoreCase("yellow")) {
					System.out.println("you win");
				}
				if(option.equalsIgnoreCase("blue")) {
					System.out.println("etean by beast");
				}
				else if(option.equalsIgnoreCase("red")) {
					System.out.println("Burned by fire");
				}
				 else {
						System.out.println("game over");
					}
			}
			 else {
				System.out.println("attack by trout");
			}
		}
		else {
			System.out.println("fall into hole game over");
		}
	}

}
