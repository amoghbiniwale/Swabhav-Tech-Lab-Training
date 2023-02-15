package com.aurionpro.model;

public class OrderRepository implements IRepository {

	@Override
	public void creat() {
		System.out.println("it is created");
	}

	@Override
	public void update() {
		System.out.println("it is updated");
	}

	@Override
	public void delete() {
		System.out.println("it is deleted");
	}

	@Override
	public void read() {
		System.out.println("read");
	}

}
