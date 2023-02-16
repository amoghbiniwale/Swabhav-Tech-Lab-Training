package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotionable;
import com.aurionpro.model.IMannarable;
import com.aurionpro.model.Man;

public class ManBoyTest {

	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();
		
		atTheMovie(man);
		atTheMovie(boy);
		
		atTheParty(man);
		//atTheParty(boy);
	}
	private static void atTheParty(IEmotionable obj) {
		obj.cry();
		obj.laugh();
	}
	private static void atTheMovie(IMannarable obj) {
		obj.greetOnArrival();
		obj.greetOnDeparture();
	}

}
