package com.aurionpro.test;

import java.util.TreeSet;

public class treeList2 {
	public static void main(String args[]) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("B");
		set.add("A");
		set.add("C");
		set.add("D");
		set.add("E");

		System.out.println("Intial Set: " + set);

		System.out.println("Head Set: " + set.headSet("C"));

		System.out.println("SubSet: " + set.subSet("A", "E"));

		System.out.println("TailSet: " + set.tailSet("C"));
	}
}
