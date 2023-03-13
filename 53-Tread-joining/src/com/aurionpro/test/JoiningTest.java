package com.aurionpro.test;

import com.aurionpro.model.JoinExample;

public class JoiningTest {

	public static void main(String[] args) {
		JoinExample obj1 = new JoinExample();
		JoinExample obj2 = new JoinExample();
		JoinExample obj3 = new JoinExample();
		
		obj1.start();
		try {
			obj1.join(1500);
		} catch (Exception e) {
			System.out.println(e);
		}
		obj2.start();
		obj3.start();
	}
	// when obj1 is completes its task for 1500 miliseconds(3 times)
	//then obj2 and obj3 starts executing.

}
