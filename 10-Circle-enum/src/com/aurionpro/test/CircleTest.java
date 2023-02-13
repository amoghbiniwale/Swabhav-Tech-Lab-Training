package com.aurionpro.test;

import com.aurionpro.model.Circle;

import com.aurionpro.model.BorderType;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle();
	
		circle.setRadius(15);
		circle.setBorderType(BorderType.solid);

		System.out.println(circle.getRadius());
		System.out.println(circle.CalculateArea());
		System.out.println(circle.getBorderType());
	}

}
