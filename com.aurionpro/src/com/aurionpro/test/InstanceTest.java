package com.aurionpro.test;

public class InstanceTest {
	private int len;
	private static int count;
	
	public static void main(String[] args) {
//		int x;
//		System.out.println(x);
		String str;
		InstanceTest obj=new InstanceTest();
		System.out.println(obj.len);
		obj.printLen();
		display();
		InstanceTest obj1=new InstanceTest();
		obj1.printLen();
		System.out.println(count);
	}
	
	public void printLen() {
		System.out.println(len);
		System.out.println(count);
	}
	
	public static void display() {
		//System.out.println(len);
		System.out.println(count);
	}

}
