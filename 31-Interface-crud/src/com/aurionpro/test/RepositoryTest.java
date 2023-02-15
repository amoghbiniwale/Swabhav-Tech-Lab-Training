package com.aurionpro.test;

import com.aurionpro.model.CustomerRepository;
import com.aurionpro.model.IRepository;
import com.aurionpro.model.OrderRepository;
import com.aurionpro.model.ProductRepository;

public class RepositoryTest {

	public static void main(String[] args) {
		doDbOperation(new ProductRepository());
		doDbOperation(new CustomerRepository());
		doDbOperation(new OrderRepository());
	}

	private static void doDbOperation(IRepository obj) {
		obj.creat();
		obj.delete();
		obj.read();
		obj.update();
		System.out.println("------");
	}

	
}
