package com.aurionpro.model;

public class child extends parent {
	public child(){
		//super("hello"); default contructor
		super("hello");//calling parametersized constructor
		System.out.println("inside child class");
	}
	static {
		System.out.println("inside child static block");
	}
}
