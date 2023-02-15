package com.aurionpro.model;

public class Bus extends vehicle implements IMovable {

	public Bus(String name) {
		super(name);
		System.out.println("Bus is Moving "+name);
	}

	@Override
	public void move() {
		System.out.println(getName()+" bus is moving");
	}
	

}
