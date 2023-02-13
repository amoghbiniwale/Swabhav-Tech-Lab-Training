package com.aurionpro.model;

public class Rectangle {
	private double height;
	private double width;
	private Color color;
	

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Rectangle (double height, double width,Color color) {
		this.height=height;
		this.width=width;
		this.color=color;
	}
	public Rectangle(double height,double width) {
		this(height,width,Color.green);
	}
	public Rectangle() {
		this(5,10,Color.green);
	}

	public double CalculateRectangleArea () {
		return height * width;
	}

}
