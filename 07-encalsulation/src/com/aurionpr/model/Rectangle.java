package com.aurionpr.model;

public class Rectangle {
	private int height;
	private double width;
	private String color;

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

	private double getCorrectedValue(double num) {
		if (num < 0) {
			return 1;
		}
		if (width > 100) {
			this.width = 100;
		}
		return num;
	}

	public void setColor(String c1) {
		color = getCorrectedValueForString(c1.toLowerCase());
	}

	private String getCorrectedValueForString(String c1) {
		if (c1.equals("red") || color.equals("yellow")) {
			return c1 ;
		}
		return "green";
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public String getColor() {
		return color;
	}
}
