package com.aurionpro.model;

public abstract class Employee {
	public double employeeId;
	public String name;
	public double basicSalary;
	
	public Employee(double employeeId, String name, double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public double getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(double employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public abstract double calculateAnnualCTC();

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", basicSalary=" + basicSalary + "]";
	}
	
	
}