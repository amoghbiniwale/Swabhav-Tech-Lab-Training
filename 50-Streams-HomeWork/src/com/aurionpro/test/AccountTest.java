package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> accountList = Arrays.asList(new Account(1, "Amogh", 40000), new Account(2, "samruddha", 50000),
				new Account(3, "ram", 30000), new Account(4, "kam", 20000));

		// a. Show Account details of account with maximum Balance
		accountList.stream().max(Comparator.comparing(Account::getBalance)).ifPresent(System.out::println);

		// b. Show Account details of account with minimum Balance
		accountList.stream().min(Comparator.comparing(Account::getBalance)).ifPresent(System.out::println);
		System.out.println();

		//c. Show names greater than 6 characters

		 List<Account> greaterthanSix = accountList.stream().filter(n -> n.getName().length() > 6).collect(Collectors.toList());
		 System.out.println("names grater than six: "+greaterthanSix);
//		
		//d total balance
		List<Account> balance = accountList.stream().sorted(Comparator.comparing(Account::getBalance))
				.collect(Collectors.toList());
		balance.forEach(System.out::println);
//		for(Account x:accountList) {
//			double totalBalance =0;
//			totalBalance += x.getBalance();
//			System.out.println(x);
//		}
//		System.out.println(totalBalance);
	}

}
