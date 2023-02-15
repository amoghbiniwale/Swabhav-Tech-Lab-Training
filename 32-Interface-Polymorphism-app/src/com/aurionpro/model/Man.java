package com.aurionpro.model;

public class Man implements IMannarable,IEmotionable {

	@Override
	public void greetOnArrival() {
		System.out.println("greetOnArrival");
	}

	@Override
	public void greetOnDeparture() {
		System.out.println("greetOnDeparture");

	}

	@Override
	public void laugh() {
		System.out.println("man is laughing");
	}

	@Override
	public void cry() {
		System.out.println("man is crying");
		
	}

}
