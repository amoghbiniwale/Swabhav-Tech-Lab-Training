package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.LineItem;

public class LineItemtest {

	public static void main(String[] args) {

		ArrayList<LineItem> li = new ArrayList<LineItem>();
		LineItem item1 = new LineItem(1, "pepsi", 5, 20);
		LineItem item2 = new LineItem(2, "kurkure", 2, 10);
		LineItem item3 = new LineItem(3, "maza", 3, 40);
		LineItem item4 = new LineItem(4, "parle-G", 5, 10);
		li.add(new LineItem(5,"coke",2,40));//another way of adding object 

		li.add(item1);
		li.add(item2);
		li.add(item3);
		li.add(item4);
		

		listCart(li);

	}

	private static void listCart(ArrayList<LineItem> li) {
		double totalCost = 0;
		for (LineItem x : li) {
			System.out.println(x);
			totalCost += x.calculateCost();
		}
		System.out.println("total cost of product:" + totalCost);
	}

}
