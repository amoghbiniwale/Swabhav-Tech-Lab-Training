package com.aurionpro.model;

public class Bike extends vehicle implements IMovable {

	public Bike(String name) {
		super(name);
		System.out.println("Bike is moving "+name);
	}

	@Override
	public void move() {
		System.out.println(getName()+" bike is moving");
	}
	

}
