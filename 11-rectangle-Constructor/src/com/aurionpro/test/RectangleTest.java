package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10,20);
		PrintRectangleDetails(rectangle);
		
		Rectangle rectangle2 = new Rectangle(30,40);
		PrintRectangleDetails(rectangle2);
		
		Rectangle rectangle3 = new Rectangle(50,60);
		PrintRectangleDetails(rectangle3);
		
		
			
	}

	private static void PrintRectangleDetails(Rectangle rectangle ) {
		System.out.println("width:"+rectangle.getHeight());
		System.out.println("height:"+rectangle.getWidth());
		System.out.println("area:"+rectangle.CalculateRectangleArea());
		
		
	}

}
