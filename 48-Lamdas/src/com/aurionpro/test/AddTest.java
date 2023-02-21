package com.aurionpro.test;

import com.aurionpro.model.AddIntegers;
import com.aurionpro.model.IAddable;

public class AddTest {

	public static void main(String[] args) {
		IAddable addObj = new AddIntegers();
		System.out.println(addObj.add(10, 20));
		
		IAddable addObj2 = new IAddable() {

			@Override
			public int add(int a, int b) {
				return a+b;
			}
			
		};
		System.out.println(addObj2.add(20, 30));
		
		//lamda function
		IAddable addObj3 =(a,b)->a+b;
		System.out.println(addObj3.add(50,40));
	}
	
	
	
}
