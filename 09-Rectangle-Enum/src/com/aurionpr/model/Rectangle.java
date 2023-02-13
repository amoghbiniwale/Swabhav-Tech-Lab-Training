package com.aurionpr.model;

public class Rectangle {
	private int height;
	private double width;
	private Color color;

	public void setHeight(int h1) {
		height = getCorrectedValueInt(h1);
	}

	private int getCorrectedValueInt(int num1) {
		if (num1 < 0) {
			return 1;
		}
		if (num1 > 100) {
			return 100;
		}
		return num1;

	}

	public void setWidth(double w1) {
		width = getCorrectedValue(w1);
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	

	private double getCorrectedValue(double num) {
		if (num < 0) {
			return 1;
		}
		if (width > 100) {
			this.width = 100;
		}
		return num;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}
	
	public Color getColor() {
		return color;
	}	
}
