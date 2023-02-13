package com.auronpro.model;

public class Account {
	private String accno;
	private String name;
	private int balance;
	private static int count;
	private static int i =0;
	
	
	public Account(String accno, String name,int balance) {
		super();
		i++;
		this.accno="S00"+i;
		this.name=name;
		this.balance=balance;
		count++;
	}
	
	public Account(String accno, String name) {
		super();
		this.name=name;
		this.name=name;
	}
	public Account(int balance) {
		super();
		this.balance=balance;
		
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
	
	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	public static int printAccountCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
