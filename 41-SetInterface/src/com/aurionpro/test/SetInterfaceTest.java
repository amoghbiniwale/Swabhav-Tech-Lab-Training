package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceTest {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(50);
		
		System.out.println(set);
		set.forEach(System.out::println);
	}
	
}
