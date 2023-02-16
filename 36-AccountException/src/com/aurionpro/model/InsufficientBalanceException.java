package com.aurionpro.model;

public class InsufficientBalanceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Account account;
	double amount;

	public InsufficientBalanceException(Account account, double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}

	@Override
	public String getMessage() {
		String message = "";
		message += "Can not withdraw amount : Rs.  " + amount;
		message += "\naccount no :" + account.getAccountNumber();
		message += "\ncurrent balance :" + account.getBalance();
		message += "\nminimum balance is 1000";
		return message;
	}
}
