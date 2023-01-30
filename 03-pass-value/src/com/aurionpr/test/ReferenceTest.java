package com.aurionpr.test;

import com.aurionpro.model.Circle;

public class ReferenceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius=10;
		ChangeRadiusToZeroByReference(c);
		System.out.println(c.radius);
	}

	private static void ChangeRadiusToZeroByReference(Circle cir) {
		cir.radius=0;
	}

}
