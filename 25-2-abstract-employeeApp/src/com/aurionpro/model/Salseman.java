package com.aurionpro.model;

public class Salseman extends Employee {

	private double bonus;

	public Salseman(double employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		bonus = 0.30 * basicSalary;
	}

	@Override
	public double calculateAnnualCTC() {
		return basicSalary + (getBasicSalary() + bonus) * 12;
	}

	@Override
	public String toString() {
		return "Salseman [bonus=" + bonus + "]";
	}

}
