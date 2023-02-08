package com.aurionpro.test;

import java.util.*;
import java.util.Random;

public class PigGame {
	public static void main(String[] args) {
		int turns = 0;
		int playerScores = 0;
		int playerTotal = 0;

		int dice;
		boolean gameOver = false;
		boolean turnOver = false;
		char repeat;
		String input;
		Scanner keyboard = new Scanner(System.in);

		Random rand = new Random();
		System.out.println("Welcome to the game of Pig!\n");
		System.out.println("Enter 'r' to roll  'h' to hold.");
		do {
			turns++;
			System.out.println("Turns:" + turns);
			while (gameOver == false) {
				do {
					input = keyboard.nextLine();
					dice = rand.nextInt(6) + 1;
					System.out.println("You rolled: " + dice);
					if (dice == 1) {
						playerScores = 0;
						System.out.print("You lose....! ");
						System.out.println("Your total is " + playerTotal);
						turnOver = true;
						while (playerTotal < 20);
					} else {
						playerScores += dice;
						System.out.println("Your turn score is " + playerScores);
						System.out.println("Enter 'r' to roll 'h' to hold.");
						input = keyboard.nextLine();
						repeat = input.charAt(0);

						if (repeat == 'h')

							break;
					}
				} while (turnOver == false || dice != 1);
				playerTotal += playerScores;
				System.out.println("Your score is " + playerTotal);
				System.out.println(" r or h ");
				playerScores = 0;
				turns++;
				System.out.println("Turn:" + turns);
				if (playerTotal >= 20) {
					System.out.println("....YOU WIN....!");
					gameOver = true;
					while (playerTotal >= 20);
				}

			}
		} while (turns > 3);

	}
}
