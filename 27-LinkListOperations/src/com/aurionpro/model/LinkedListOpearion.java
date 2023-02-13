package com.aurionpro.model;

import java.io.*;
import java.util.LinkedList;

public class LinkedListOpearion {
	public Node head; // head of list

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public boolean search(Node head, int x)
    {
        // Initialize current
        Node current = head;   
        while (current != null)
        {
            // Data found
            if (current.data == x)
                return true;   
            current = current.next;
        }
     
        // Data not found
        return false;   
    }
 

	public void deleteNode(int key) {
		// Store head node
		Node temp = head, prev = null;

		// If head node itself holds the key to be deleted
		if (temp != null && temp.data == key) {
			head = temp.next; // Changed head
			return;
		}
		// Search for the key to be deleted, keep track of
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		// If key was not present in linked list
		if (temp == null)
			return;

		// Unlink the node from linked list
		prev.next = temp.next;
	}

	/* Inserts a new Node at front of the list. */

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	// This function prints contents of linked list starting from the given node

	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

}
