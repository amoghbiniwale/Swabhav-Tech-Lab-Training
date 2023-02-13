package com.aurionpro.test;

import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10,20,Color.black);
		PrintRectangleDetails(rectangle);
		
		Rectangle rectangle2 = new Rectangle(30,40,Color.green);
		PrintRectangleDetails(rectangle2);
		
		Rectangle rectangle3 = new Rectangle(50,60,Color.red);
		PrintRectangleDetails(rectangle3);			
	}

	private static void PrintRectangleDetails(Rectangle rect ) {
		System.out.println("width:"+rect.getHeight());
		System.out.println("height:"+rect.getWidth());
		System.out.println("Color:"+rect.getColor());
		System.out.println("area:"+rect.CalculateRectangleArea());
		
		
	}

}
