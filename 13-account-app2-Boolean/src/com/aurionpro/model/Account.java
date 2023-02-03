package com.aurionpro.model;

public class Account {
	private int AccountNumber;
	private String Name;
	private double Balance;

	public Account(int accountNumber, String name, double balance) {
		AccountNumber = accountNumber;
		Name = name;
		Balance = balance;
	}

	public Account(int accountNumber, String name) {
		AccountNumber = accountNumber;
		Name = name;
	}

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

	public boolean deposit(double amount) {
		if (amount>0) {
			Balance+=amount;
			return true;
		}
		return false;

	}

	public boolean Withdraw(double amount) {
		if (amount > 0) {
			Balance = Balance - amount;
			return true;
		}
		return false;
		
	}

}
