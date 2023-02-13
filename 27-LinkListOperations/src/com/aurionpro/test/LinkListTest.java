package com.aurionpro.test;

import java.util.LinkedList;

import com.aurionpro.model.LinkedListOpearion;

public class LinkListTest {

	public static void main(String[] args) {
		LinkedListOpearion llist = new LinkedListOpearion();

		llist.push(7);
		llist.push(1);
		llist.push(3);
		llist.push(2);

		llist.push(10);
		llist.push(30);
		llist.push(11);
		llist.push(21);
		llist.push(14);

		System.out.println("Created Linked list is:");
		llist.printList();

		// search
		if (llist.search(llist.head, 21))
			System.out.println("Yes number is present");
		else
			System.out.println("No number is not present");

		llist.deleteNode(1); // Delete node with data 1
		System.out.println("Linked List after Deletion of given number is: ");
		llist.printList();

	}

}
