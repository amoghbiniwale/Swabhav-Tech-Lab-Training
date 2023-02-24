package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(10,20,30,40,6,5,21,44,55);
		System.out.println(numList);
		
		
		//Collections.sort(numList,Collections.reverseOrder());
		List<Integer> sortedList = numList.stream()
				.filter(n->n%2==0)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(sortedList);
		
//		List<String> nameList = Arrays.asList("amogh","sam","ram");
//		Collections.sort(nameList,Collections.reverseOrder());
//		System.out.println(nameList);
	}

}
