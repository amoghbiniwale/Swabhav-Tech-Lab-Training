package com.aurionpro.test;

import com.aurionpr.model.Color;
import com.aurionpr.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.setHeight(55);
		r.setWidth(12.7775);
		r.setColor(Color.black);
		
		
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		System.out.println(r.getColor());
		
		
		/*r.height=12;
		r.width=12.5;
		r.color=("red");
		System.out.println(r.height);
		System.out.println(r.width);
		System.out.println(r.color);
		
		Rectangle r2 = new Rectangle();
		System.out.println(r2.height);
		System.out.println(r2.width);
		System.out.println(r2.color);
		r2.color="yellow";
		r2.height=15;
		r2.width=15.5;*/
		
			
	}

}
