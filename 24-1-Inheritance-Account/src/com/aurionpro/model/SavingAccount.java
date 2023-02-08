package com.aurionpro.model;

public class SavingAccount extends Account {
	
	
	private static double MIN_BALANCE =1000;
	public SavingAccount(String name,int accountNumber,double balance) {
		super(name,accountNumber,balance);
	}
	
		public SavingAccount(String name,int accountNumber) {
			super(name,accountNumber,1000);
	}
		@Override
		public void withdraw(double amount) {
			if((this.getBalance()- amount)>MIN_BALANCE){
				this.setBalance(getBalance()- amount);
			}
		}
}
