package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account[] account = { new Account(1, "Amogh", 4000), new Account(2, "sam", 5000), new Account(3, "ram", 6000),
				new Account(4, "sam", 7000), new Account(5, "sham", 3000) };
		for (Account x : account) {
			System.out.println(x);
		}
		double max = account[0].getBalance();
		int i;
		int index = 0;
		for (i = 0; i < account.length; i++) {
			if (max < account[i].getBalance()) {
				index = i;
			}
		}

		System.out.println("heights value is:" + account[index]);
		System.out.println();

		System.out.println("sorting array from asending order");
		sortArray(account);

		for (Account x : account) {
			PrintAccountDetails(x);
		}
	}

	private static void sortArray(Account[] acc) {
		Account temp;
		for (int i = 0; i < acc.length; i++) {
			for (int j = i + 1; j < acc.length; j++) {
				if (acc[j].getBalance() < acc[i].getBalance()) {
					temp = acc[i];
					acc[i] = acc[j];
					acc[j] = temp;
				}
			}
		}
	}

	private static void PrintAccountDetails(Account account) {
		System.out.println("account no:" + account.getAccountNumber());
		System.out.println("Name:" + account.getName());
		System.out.println("Balance:" + account.getBalance());
		System.out.println();

	}

}
