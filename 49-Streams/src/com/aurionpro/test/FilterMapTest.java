package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterMapTest {

	public static void main(String[] args) {
		List<Integer>list1 =Arrays.asList(2,3,5);
		List<Integer>list2 =Arrays.asList(3,4,6);
		List<Integer>list3 =Arrays.asList(8,7,9);
		
		List<Integer> combineList=new ArrayList<Integer>();
		combineList.addAll(list1);
		combineList.addAll(list2);
		combineList.addAll(list3);
		
		System.out.println(combineList);
		
		
	}

}
