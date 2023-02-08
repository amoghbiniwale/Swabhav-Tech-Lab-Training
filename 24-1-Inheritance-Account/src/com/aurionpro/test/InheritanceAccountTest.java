package com.aurionpro.test;


import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class InheritanceAccountTest {

	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount("amogh", 1001,10000);
		savingAccount.deposit(2000);
		savingAccount.withdraw(1000);
		
		CurrentAccount currentAccount = new CurrentAccount("sam",1002,10000);
		currentAccount.deposit(2000);
		currentAccount.withdraw(3000);
		
		printAccountDetails(savingAccount);
		printAccountDetails(currentAccount);
		
	}

	private static void printAccountDetails(CurrentAccount currentAccount) {
		System.out.println("name of account holder: "+currentAccount.getName());
		System.out.println("account number: "+currentAccount.getAccountNumber());
		System.out.println("balance : "+currentAccount.getBalance());
		System.out.println();
		
	}

	private static void printAccountDetails(SavingAccount savingAccount) {
		System.out.println("name of account holder: "+savingAccount.getName());
		System.out.println("account number: "+savingAccount.getAccountNumber());
		System.out.println("balance : "+savingAccount.getBalance());
		System.out.println();
	}

}
