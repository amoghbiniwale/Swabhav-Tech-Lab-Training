package com.aurionpro.test;

import com.aurionpro.model.BMI;
import com.aurionpro.model.Person;

public class BMI_Test {

	public static void main(String[] args) {
		Person person = new Person("amogh",23,1.77,58);
		BMI bmi = new BMI(person);
		calculateBMI(person);
		System.out.println("BMI is: "+bmi.calculateBMI());
		System.out.println(person.getName()+" is "+ bmi.getBodyType());
		
	}

	private static void calculateBMI(Person person) {
		System.out.println("person name: "+person.getName());
		System.out.println("person height: "+person.getHeight());
		System.out.println("person weight: "+person.getweight());
	}

}
