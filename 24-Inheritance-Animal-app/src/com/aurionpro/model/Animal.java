package com.aurionpro.model;

public class Animal {
	private String name;
	private Boolean isCarnivorous;

	public Animal(String name,Boolean isCarnivorous) {
		super();
		this.name=name;
		this.isCarnivorous=isCarnivorous;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsCarnivorous() {
		return isCarnivorous;
	}

	public void setIsCarnivorous(Boolean isCarnivorous) {
		this.isCarnivorous = isCarnivorous;
	}

	public void eat() {
		System.out.println("Animal's are eating");
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", isCarnivorous=" + isCarnivorous + "]";
	}
	

}
