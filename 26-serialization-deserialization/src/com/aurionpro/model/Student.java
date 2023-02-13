package com.aurionpro.model;

import java.util.*;

import java.io.Serializable;

public class Student implements Serializable {
	public int id;
	public String name;
	public double percentage;
	public static final long serialVersionUID=1L;
	public Student(int id, String name, double percentage) {
		
		
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		
		
	}
	
	
	
	
	

}
