package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		HashSet<Account> set = new HashSet<>();
		set.add(new Account(1,"amogh",5000));
		set.add(new Account(1,"prathmesh",6000));
		set.add(new Account(2,"akshay",6000));
		set.add(new Account(3,"sam",7000));
		
		
		Account account = new Account(1,"abc",5000);
		set.add(account);
		
		
		for(Account x :set) {
			System.out.println(set);
		}
			
		}
		

	//	account.add(account1);
//		account.add(account2);
//		account.add(account3);
//		account.add(account4);
//		Collections.sort(account);
//		
//		totalOfAccount(account);

	}

//	private static void totalOfAccount(ArrayList<Account> account) {
//		double totalBalance = 0;
//		int max = 0;
//		int index = 0;
//		int index1 = 0;
//
//		for (Account x : account) {
//			totalBalance += x.getBalance();
//			System.out.println(x);
//		}
//		
//	
//			for (int i = 0; i < account.size(); i++) {
//				if (max < account.get(0).getBalance()) {
//					index = i;
//				}
//			}
//
//			for (int j = 0; j < account.size(); j++) {
//				if (max > account.get(0).getBalance()) {
//					index1 = j;
//				}
//			}
//			System.out.println("total balance:" + totalBalance);
//			System.out.println("maximum balance is :" + account.get(index));
//			System.out.println("minimum balance is:" + account.get(index1));
//
//		}
//		
//
//}
