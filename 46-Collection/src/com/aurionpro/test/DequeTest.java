package com.aurionpro.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.add(1);
		deque.add(2);
		deque.add(3);
		System.out.println("Inserting three elements : ");
		for (Integer x : deque) {
			System.out.println(x);
		}

		deque.pop();
		System.out.println("after popping: ");
		for (Integer x : deque) {
			System.out.println(x);
		}

		deque.remove(3);
		System.out.println("Removing the element 3 :" + deque);
		
	}
	
}
