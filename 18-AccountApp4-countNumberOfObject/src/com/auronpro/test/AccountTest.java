package com.auronpro.test;

import com.auronpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account1 = new Account(1,"amogh",1000);
		Account account2 = new Account(2,"prathmesh",2000);
		Account account3 = new Account(3,"akshay",3000);
		
		System.out.println();
		System.out.println("objects are created");
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
		
		int count =Account.printAccountCount();
		System.out.println(count);
		
	}

}
