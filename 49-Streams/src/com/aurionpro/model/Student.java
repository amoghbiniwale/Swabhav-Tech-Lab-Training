package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int id;
	private String name;
	List<String>hobbies= new ArrayList<String>();
	
	public Student(int id, String name, List<String> hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
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

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", hobbies=" + hobbies + "]";
	}
	
	
	
	
	
}
