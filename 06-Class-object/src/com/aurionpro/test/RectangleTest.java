package com.aurionpro.test;

import com.aurionpr.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
			
		r.height=12;
		r.width=12.5;
		r.color=("red");
		System.out.println(r.height);
		System.out.println(r.width);
		System.out.println(r.color);
		
		Rectangle r2 = new Rectangle();
			
		r2.color="yellow";
		r2.height=15;
		r2.width=15.5;
		System.out.println(r2.height);
		System.out.println(r2.width);
		System.out.println(r2.color);		
	}

}
