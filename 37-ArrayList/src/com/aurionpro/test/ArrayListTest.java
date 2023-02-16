package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;





public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list.size());
		
		System.out.println(list);
		for(Integer x: list) {
			System.out.println(x);
		}
		list.forEach(System.out::println);
		for(int i =0 ; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		list.remove(0);
		System.out.println(list);
		list.remove(new Integer(20));
		System.out.println(list);
		
		list.contains(30);
	}

}
