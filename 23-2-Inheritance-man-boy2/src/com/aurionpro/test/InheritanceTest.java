package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Man;
import com.aurionpro.model.kid;

public class InheritanceTest {

	public static void main(String[] args) {
		case1();
		case2();
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
