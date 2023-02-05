package com.aurionpro.model;

public class Account {
	private int AccountNumber;
	private String Name;
	private double Balance;
	
	//constructor
	public Account(int accountNumber, String name, double balance) {
		AccountNumber = accountNumber;
		Name = name;
		Balance = balance;
	}

	public Account(int accountNumber, String name) {
		AccountNumber = accountNumber;
		Name = name;
	}
	
	//getters setters
	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}
	
	//methods
	
	public void deposit(double amount) {
		Balance = Balance+=amount;
	}
	
	public void withdraw(double amount) {
		if(Balance-amount>1000) {
			Balance=Balance-amount;
		}
	}
	
}
