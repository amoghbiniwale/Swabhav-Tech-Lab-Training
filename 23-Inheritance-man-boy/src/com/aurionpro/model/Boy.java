package com.aurionpro.model;
import com.aurionpro.model.Man;

public class Boy extends Man {
	
	public void play() {
		System.out.println("Boy is reading");
	}
	
	@Override
	public void read() {
		System.out.println("Boy is reading");
	}
	@Override
	public void eat() {
		System.out.println("boy is eating...");
	}
}
