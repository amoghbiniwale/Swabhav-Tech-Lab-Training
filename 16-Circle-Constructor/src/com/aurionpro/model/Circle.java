package com.aurionpro.model;

public class Circle {
	private double radius;
	private Color color;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Circle(Color color, double radius) {
		super();
		this.radius=radius;
		this.color=color;
		
	}
	public double CalculateArea() {
		double area = Math.PI*radius *radius ;
		return area;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	
	
}
