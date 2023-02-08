package com.aurionpro.model;

public class Manager extends Employee {
	private double hra;
	private double da;
	private double ta;
	
	public Manager(int employeeId,String name,double basicSalary) {
		super(employeeId,name,basicSalary);
		hra= 0.25*basicSalary;
		da=0.15*basicSalary;
		ta=0.10*basicSalary;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	@Override
	public double calculateAnnualCTC() {
		return (getBasicSalary()+hra+ta+da)*12;
	}
	@Override
	public String toString() {
		return "Manager [hra=" + hra + ", da=" + da + ", ta=" + ta + "]";
	}
	
	
	
}
