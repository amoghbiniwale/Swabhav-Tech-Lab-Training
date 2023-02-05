package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(1,"amogh",10000);
		printAccountDetails(account);
		account.withdraw(200);
		
		printAccountDetails(account);
		account.deposit(2000);
		
		printAccountDetails(account);
		account.withdraw(10000);
		
		printAccountDetails(account);
		
		}	
	
	private static void printAccountDetails(Account account) {
		System.out.println("Name:"+ account.getName());
		System.out.println("account no:"+account.getAccountNumber());
		System.out.println("Balance:"+  account.getBalance());
		System.out.println();
		
	}

}
