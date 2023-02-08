package com.aurionpro.model;

public class Account {
	private String name;
	private int accountNumber;
	private double balance;
	
	public Account(String name,int accountNumber,double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public Account(String name,int accountNumber) {
		
		this(name, accountNumber,1000);		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance = balance - amount;
	}

//	@Override
	//public String toString() {
		//return "Account [name=" + name + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	//}
	
	
	
	
}
