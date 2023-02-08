package com.aurionpro.model;

public class CurrentAccount extends Account {
	static final int OVER_DRAFT_LIMIT=-20000;
	public CurrentAccount(String name, int accountNumber,double balance) {
		super(name, accountNumber,balance);
	}
	
	public CurrentAccount(String name, int accountNumber) {
		super(name, accountNumber,1000);
	}
		@Override
		public void withdraw(double amount) {
			if((this.getBalance() + amount)>OVER_DRAFT_LIMIT){
				this.setBalance(this.getBalance()- amount);
			}
		}
	
}
