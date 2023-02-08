package com.aurionpro.test;



import com.aurionpro.model.Circle;
import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		Circle circle = new Circle(Color.red,7);
		circle.getColor();
		circle.calculateArea();
		System.out.println(circle.calculateArea());
		System.out.println(circle.getColor());

		
		
		Rectangle rectangle = new Rectangle(30,20,Color.blue);
		rectangle.getColor();
		rectangle.calculateArea();
		System.out.println(rectangle.calculateArea());
		System.out.println(rectangle.getColor());
	}
	

}
