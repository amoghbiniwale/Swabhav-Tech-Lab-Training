package com.aurionpro.test;

import com.aurionpro.model.IGreetable;

public class GreetTest {

	public static void main(String[] args) {
		IGreetable obj = (name)-> System.out.println("good morning "+name);
		obj.greet("amogh");
		
		IGreetable obj2 = GreetTest::welcome;
		obj2.greet("sam");
		
		GreetTest test = new GreetTest();
		IGreetable AddTest = test::helloAll;
		AddTest.greet("kk");
	}
	public static void welcome(String name) {
		System.out.println("welcome "+name);
	}
	public void helloAll(String name) {
		System.out.println("hello "+name);
	}
}
