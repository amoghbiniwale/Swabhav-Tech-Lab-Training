package com.aurionpro.model;
import java.util.*;

public class GuessTheNumber {
	
	private int userNumber;
	private int computerNumber;
	private int counter = 0;
	
	//constructor
	public GuessTheNumber() {
		computerNumber = (int)  (Math.random()*100);		 
	}
	
	//getter setters
	public int getUserNumber() {
		return userNumber;
	}


	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}


	public int getComputerNumber() {
		return computerNumber;
	}


	public void setComputerNumber(int computerNumber) {
		this.computerNumber = computerNumber;
	}


	public int getCounter() {
		return counter;
	}


	public void setCounter(int counter) {
		this.counter = counter;
	}


	
	//methods
	public int isCorrect() {
		if(userNumber > computerNumber) return -1;
		else if(userNumber < computerNumber)return +1;
		else return 0;
	}
	public  void conter() {
		counter++;
	}

	public void setNumber(int n) {
		userNumber = n;
	}
	
}
