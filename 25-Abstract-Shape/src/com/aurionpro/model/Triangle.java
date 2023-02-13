package com.aurionpro.model;

public class Triangle extends Shape {
	private double length;
	private double breth;

	public Triangle(double length,double breth,Color color) {
		super(color);
		this.length=length;
		this.breth= breth;
		
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}

	public double getBreth() {
		return breth;
	}
	
	public void setBreth(double breth) {
		this.breth = breth;
	}
	
	@Override
	public double calculateArea() {
		
		return 0.5* length * breth;
		
	}
	
	

}
