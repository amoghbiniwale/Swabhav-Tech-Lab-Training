package com.aurionpro.test;

import java.util.Scanner;

public class BookCricketGame {

	public static void main(String[] args) {
		int choice;
		String player1_name, player2_name;
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to Book Cricket Game.../follow the rules..");
		System.out.println("Assume a book of 300 pages");
		System.out.println("1. Player 1 opens the book to read a page number(example 87) (Randomly generated)");
		System.out.println(
				"2. If the page number is 87->87%7(%7 results in scorebetween 0-6)= 3 should be added to the score");
		System.out
				.println("3. Player 1 continues and keeps adding to the score untill page number results in a 0 score");
		System.out.println("4. Player 2 starts the game and tries to beat the score of player 1");
		System.out.println("5. In case of a tie, check the number of turns(player with lesser turns is winner)");

		while (true) {
			int player1_score = 0;
			int player2_score = 0;
			int points;
			int player1_round = 0;
			int player2_round = 0;
			int pageNum;

			System.out.println("enter 1 to start and 0 to exit from game");
			choice = sc.nextInt();
			if (choice == 0) {
				break;
			}
			System.out.print("Enter Player 1 Name : ");
			player1_name = sc.next();
			System.out.print("Enter Player 2 Name : ");
			player2_name = sc.next();
			System.out.println("Player : " + player1_name);

			while (true) {
				System.out.print("Enter 1 To Open Book : ");
				int order = sc.nextInt();
				pageNum = (int) (Math.random() * (300) + 1);
				points = pageNum % 7;
				player1_score += points;
				player1_round++;
				if (points == 0) {
					System.out.println("!!!\t\tOPPS\t\t!!!");
				}
				System.out.println(
						"Page Number " + pageNum + "\t\t\tPoint : " + points + "\t\t\tScore : " + player1_score);
				if (points == 0) {
					System.out.println(player1_name + " Total Score : " + player1_score);
					System.out.println(player1_name + " Takes " + player1_round + " Rounds ");
					break;
				}
			}
			System.out.println("\n" + player2_name + " Needs " + (player1_score + 1) + " Score In " + player1_round
					+ " Rounds To WIN MATCH\nPlayer : " + player2_name);
			player2_round = player1_round;

			while (true) {
				System.out.print("Enter 1 To Open Book : ");
				int order = sc.nextInt();
				pageNum = (int) (Math.random() * (300) + 1);
				points = pageNum % 7;
				player2_score += points;
				if (player2_score > player1_score) {
					break;
				}
				System.out.println("Page Number " + pageNum + "\t\t\tPoint : " + points + "\t\t\tScore : "
						+ player2_score + "\t\t\tRounds Left : " + (--player2_round));

				if (player2_score > player1_score
						|| ((player2_score == player1_score) && (player2_round < player1_round))) {
					System.out.print(player2_name + " Win Match !!\n\n");
				} else if (player1_score > player2_score) {
					System.out.print(player1_name + " Win Match !!\n\n");
				} else {
					System.out.print("IT'S A TIE");
				}
			}

		}
	}
}
