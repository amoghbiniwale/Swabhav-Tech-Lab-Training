package com.aurionpro.model;

public class Accountant extends Employee {
	private double performanceAllownce = 0.15;

	public Accountant(double employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		performanceAllownce = 0.15*basicSalary;
	}

	

	public double getPerformanceAllownce() {
		return performanceAllownce;
	}

	public void setPerformanceAllownce(double performanceAllownce) {
		this.performanceAllownce = performanceAllownce;
	}
	@Override
	public double calculateAnnualCTC() {
		return basicSalary+(getBasicSalary()+performanceAllownce)*12;
	}

	@Override
	public String toString() {
		return "Accountant [performanceAllownce=" + performanceAllownce + "]";
	}
	
	

}
