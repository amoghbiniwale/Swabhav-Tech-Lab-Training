package com.aurionpro.model;

public class Employee {
	private int id;
	private String name;
	private int salary;
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	private String deparatment;
	
	
	public Employee(int id, String name,int salary, String deparatment) {
		super();
		this.id = id;
		this.name = name;
		this.deparatment = deparatment;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deparatment=" + deparatment + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeparatment() {
		return deparatment;
	}
	public void setDeparatment(String deparatment) {
		this.deparatment = deparatment;
	}
	
	
}
