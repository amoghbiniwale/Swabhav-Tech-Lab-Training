package com.aurionpro.model;

public class parent {
	public parent(String messege) {
		System.out.println("inside parent class..."+messege);
	}
	//static block it can run only onces in one class
	//
	static {
		System.out.println("inside static block");
	}
}
