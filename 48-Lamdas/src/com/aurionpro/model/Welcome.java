package com.aurionpro.model;

public class Welcome implements IGreetable {

	@Override
	public void greet(String str) {
		System.out.println("welcome"+str);
	}

}
