package com.aurionpro.model;

public class LineItem {
	private int id;
	private String name;
	private int quantity;
	private double unitPrice;
	
	public LineItem(int d, String name, int quantity, double unitPrice) {
		super();
		this.id = d;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
	public int getD() {
		return id;
	}
	public void setD(int d) {
		this.id = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double calculateCost() {
		return   quantity * unitPrice;
	}
	@Override
	public String toString() {
		return "LineItem [id=" + id + ", name=" + name + ", quantity=" + quantity + ", unitPrice=" + unitPrice +
				", Cost=" + calculateCost() +"]";
	}
	
}
