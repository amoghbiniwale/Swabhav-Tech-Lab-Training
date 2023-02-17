package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		ArrayList<Account> account = new ArrayList<Account>();
		Account account1 = new Account(1, "amogh", 10000);
		Account account2 = new Account(2, "sam", 20000);
		Account account3 = new Account(3, "ram", 30000);
		Account account4 = new Account(4, "shyam", 40000);

		account.add(account1);
		account.add(account2);
		account.add(account3);
		account.add(account4);
		Collections.sort(account);
		
		totalOfAccount(account);

	}

	private static void totalOfAccount(ArrayList<Account> account) {
		double totalBalance = 0;
		int max = 0;
		int index = 0;
		int index1 = 0;

		for (Account x : account) {
			totalBalance += x.getBalance();
			System.out.println(x);
		}
		
	
			for (int i = 0; i < account.size(); i++) {
				if (max < account.get(0).getBalance()) {
					index = i;
				}
			}

			for (int j = 0; j < account.size(); j++) {
				if (max > account.get(0).getBalance()) {
					index1 = j;
				}
			}
			System.out.println("total balance:" + totalBalance);
			System.out.println("maximum balance is :" + account.get(index));
			System.out.println("minimum balance is:" + account.get(index1));

		}
		

}
