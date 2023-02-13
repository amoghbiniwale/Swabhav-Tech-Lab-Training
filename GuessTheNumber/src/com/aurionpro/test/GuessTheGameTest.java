package com.aurionpro.test;

import java.util.*;

import com.aurionpro.model.GuessTheNumber;

public class GuessTheGameTest {

	public static void main(String[] args) {
		GuessTheNumber gtn = new GuessTheNumber();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("enter number between 1-100");
			int n = sc.nextInt();
			gtn.setNumber(n);
			
			if(gtn.isCorrect() == 0) {
				gtn.conter();
				System.out.println("Congratulations, You've guessed the number.");
				System.out.println("Number of counts is : "+gtn.getCounter());
				System.out.println("the computer number is:"+gtn.getComputerNumber());
				break;
			}
			else if(gtn.isCorrect() == 1) {
				gtn.conter();
				System.out.println("please enter higher number..!!");
				System.out.println("number of counts : "+gtn.getCounter());
			}
			else if(gtn.isCorrect() == -1) {
				gtn.conter();
				System.out.println("please enter lower number..!!");
				System.out.println("number of counts"+gtn.getCounter());
			}
		}
	}

}
