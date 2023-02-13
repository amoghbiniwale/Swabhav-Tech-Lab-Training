package com.auronpro.test;

import com.auronpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account("","AMOGH",30000);
		Account account2 = new Account("","prathmesh",200000);
		Account account3 = new Account("","akshay",40000);
		System.out.println();	
		
		//System.out.println("objects are created");
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
		
		int count =Account.printAccountCount();
		System.out.println(count);
		
	}

}
