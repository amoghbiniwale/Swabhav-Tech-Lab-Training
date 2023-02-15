package com.aurionpro.model;

public class Car extends vehicle implements IMovable {

	public Car(String name) {
		super(name);
		System.out.println("car is moving ");
	}

	@Override
	public void move() {
		System.out.println(getName()+" car is moving");
	}
	

}
