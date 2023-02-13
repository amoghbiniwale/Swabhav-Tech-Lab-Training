package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Color;

class CircleTest {

	private static Color red;

	public static void main(String[] args) {
		Circle cr = new Circle(red,10);
		printRectangleDetails(cr);	
		
	}

	private static void printRectangleDetails(Circle circle) {
		System.out.println("radius is:"+circle.getRadius());
		System.out.println("area of circle is:"+circle.CalculateArea());
		System.out.println("color:"+circle.getColor());
	}

}
