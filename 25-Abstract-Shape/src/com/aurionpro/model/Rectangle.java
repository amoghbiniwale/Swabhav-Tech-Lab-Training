package com.aurionpro.model;

public class Rectangle extends Shape {
	double height;
	double width;
	public Rectangle(double height,double width,Color color) {
		super(color);
		this.height=height;
		this.width=width;
	}

	@Override
	public double calculateArea() {
		return height * width;
	}

}
