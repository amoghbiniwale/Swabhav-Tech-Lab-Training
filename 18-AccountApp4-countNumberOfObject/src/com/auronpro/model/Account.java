package com.auronpro.model;

public class Account {
	private int accno;
	private String name;
	private int balance;
	private static int count;
	
	public Account(int accno, String name,int balance) {
		super();
		this.accno=accno;
		this.name=name;
		this.balance=balance;
		count++;
	}
	
	public Account(int accno, String name) {
		super();
		this.name=name;
		this.name=name;
	}
	public Account(int balance) {
		super();
		this.balance=balance;	
	}
	
	
//getter setter
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getAccNumber() {
		return accno;
	}
	
	public static int printAccountCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
