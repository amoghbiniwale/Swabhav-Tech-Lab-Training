package com.aurionpro.model;

public class CustomerRepository implements IRepository {

	@Override
	public void creat() {
		System.out.println("it is created");
	}

	@Override
	public void update() {
		System.out.println("updated");
	}

	@Override
	public void delete() {
		System.out.println("deleted");
	}

	@Override
	public void read() {
System.out.println("read");
	}

}
