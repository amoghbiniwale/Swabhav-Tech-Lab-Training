package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Man;
import com.aurionpro.model.kid;

public class InheritanceTest {

	public static void main(String[] args) {
		//case1();
		//case2();
		//case3();
		case4();
		
	}

	private static void case4() {
		
		Object x;
		x=100;
		System.out.println(x.getClass());
	}

	private static void case3() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new kid());
		atThePark(new Infant());
	}

	private static void atThePark(Man man) {
		man.eat();
		man.read();
	//  man.play();
	}

	private static void case2() {
		Man man = new Boy();
		man.eat();
		man.read();
	//	man.play();
		//parent can call only print parent class methods
	}

	private static void case1() {
		Boy boy = new Boy();
		boy.eat();
		boy.read();
		
		kid kid = new kid();
		kid.eat();
		
		Infant infant = new Infant();
		infant.eat();
	}
}
