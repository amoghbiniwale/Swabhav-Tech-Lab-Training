package com.aurionpro.model;

public class Circle {
	private double radius;
	private BorderType bordertype;
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	
	public void setBorderType(BorderType bordertype) {
		this.bordertype=bordertype;
	}
	
	public BorderType getBorderType() {
		return bordertype;
	}
	public double CalculateArea() {
		double area = Math.PI*radius *radius ;
		return area;
	}
}
