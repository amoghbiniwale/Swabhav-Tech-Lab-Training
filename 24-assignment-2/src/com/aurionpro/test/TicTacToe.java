package com.aurionpro.test;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TicTacToe {
	static String[] board;
	  static String turn;

	  static String checkWinner() {
	    for (int a = 0; a < 8; a++) {
	      String line = null;
	      switch (a) {
	      case 0:
	        line = board[0] + board[1] + board[2];
	        break;
	      case 1:
	        line = board[3] + board[4] + board[5];
	        break;
	      case 2:
	        line = board[6] + board[7] + board[8];
	        break;
	      case 3:
	        line = board[0] + board[3] + board[6];
	        break;
	      case 4:
	        line = board[1] + board[4] + board[7];
	        break;
	      case 5:
	        line = board[2] + board[5] + board[8];
	        break;
	      case 6:
	        line = board[0] + board[4] + board[8];
	        break;
	      case 7:
	        line = board[2] + board[4] + board[6];
	        break;
	      }
	      if (line.equals("XXX")) {
	        return "X";

	      } else if (line.equals("OOO")) {
	        return "O";
	      }

	    }
	    for (int a = 0; a < 9; a++) {
	      if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
	        break;
	      } else if (a == 8) {
	        return "draw";
	      }
	    }
	    System.out.println(turn+" turn Kindly Enter a number to Mark " + turn+":");
	    return null;
	  }

	  static void printBoard() {
	    System.out.println("|...|...|...|");
	    System.out.println("|" + board[0] + "|" + board[1] + "|" + board[2] + "|");
	    System.out.println("|" + board[3] + "|" + board[4] + "|" + board[5] + "|");
	    System.out.println("|" + board[6] + "|" + board[7] + "|" + board[8] + "|");
	    System.out.println("|...|...|...|");
	  }

	  public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    board = new String[9];
	    turn = "X";
	    String winner = null;
	    for (int a = 0; a < 9; a++) {
	      board[a] = String.valueOf(a + 1);
	    }
	    System.out.println("Welcome to Tic Tac Toe");
	    printBoard();
	    System.out.println("First Player ,Kindly Enter a Number from 1 to 9 to Mark X :");
	    while (winner == null) {
	      int input;
	      try {
	        input = sc.nextInt();
	        if (!(input > 0 && input <= 9)) {
	          System.out.println("Invalid Number,Please Enter the  Number Between 1 to 9:");
	          continue;
	        }
	      } catch (InputMismatchException e) {
	        System.out.println("Invalid Number,Please Enter the  Number Between 1 to 9:");
	        continue;
	      }
	      if (board[input - 1].equals(String.valueOf(input))) {
	        board[input - 1] = turn;
	        if (turn.equals("X")) {
	          turn = "O";
	        } else {
	          turn = "X";

	        }
	        printBoard();
	        winner = checkWinner();
	      } else {
	        System.out.println("Place already Used;Enter the other Number:");
	      }
	    }
	    if (winner.equals("draw")) {
	      System.out.println("Its a Draw! Thanks For Playing.");
	    } else {
	      System.out.println("Congratulations!!" + winner + "'s have won!Thanks for Playing.");
	    }

	    sc.close();

	  }
}
