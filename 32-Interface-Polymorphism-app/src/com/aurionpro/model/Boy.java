package com.aurionpro.model;

public class Boy implements IMannarable {

	@Override
	public void greetOnArrival() {
		System.out.println("Boy is arrive");
	}

	@Override
	public void greetOnDeparture() {
		System.out.println("boy is depart");
	}

}
