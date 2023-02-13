package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Triangle;

public class ShapeTest {

	public static void main(String[] args) {
		Circle circle = new Circle(Color.red, 7);
		circle.getColor();
		circle.calculateArea();
		System.out.println("area of circle" + circle.calculateArea());
		System.out.println("color of circle" + circle.getColor());
		System.out.println("------");

		Rectangle rectangle = new Rectangle(30, 20, Color.blue);
		rectangle.getColor();
		rectangle.calculateArea();
		System.out.println(rectangle.calculateArea());
		System.out.println(rectangle.getColor());
		System.out.println("------");
		
		Triangle triangle = new Triangle(5, 5, Color.blue);
		triangle.getColor();
		triangle.calculateArea();
		System.out.println("area of triangle: " + triangle.calculateArea());
		System.out.println("color is: " + triangle.getColor());
		System.out.println("------");
	}

}
