package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.InsufficientBalanceException;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(01,"amogh",1000);
		
		try {
			account.withdraw(2000);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
