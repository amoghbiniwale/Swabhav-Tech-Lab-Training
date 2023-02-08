package com.aurionpro.test;

import com.aurionpro.model.Animal;
import com.aurionpro.model.cow;
import com.aurionpro.model.lion;

public class AnimalTest {

	public static void main(String[] args) {
		Animal a = new Animal("wild animal",true);
		cow c = new cow("Herbivorus",false);
		lion l = new lion("Carnivorous",true);
		
		System.out.println(a);
		a.eat();
		
		System.out.println(c);
		c.eat();
		
		System.out.println(l);
		l.eat();
		
	}

}
