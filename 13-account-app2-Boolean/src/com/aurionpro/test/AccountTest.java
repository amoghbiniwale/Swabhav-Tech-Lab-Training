package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(1, "amogh", 10000);

		withdraw(account, 1000);
		deposite(account, 2000);
		PrintAccountDetails(account);
	}

	private static void deposite(Account account, int amount) {
		// TODO Auto-generated method stub
		if(account.deposit(amount)) {
			System.out.println("successful..");
			System.out.println("your account no is:"+account.getAccountNumber());
			System.out.println("your balance:"+account.getBalance());
			
			
		}
		else {
			System.out.println("not withdraw successfully...");
		}
	}

	private static void withdraw(Account account, int amount) {
		if(account.Withdraw(amount)) {
			System.out.println("account number is :"+account.getAccountNumber());
			System.out.println("balance :"+account.getBalance());
		}
	}

	private static void PrintAccountDetails(Account account) {
		System.out.println("account no:" + account.getAccountNumber());
		System.out.println("Name:" + account.getName());
		System.out.println("Balance:" + account.getBalance());
	}

}
