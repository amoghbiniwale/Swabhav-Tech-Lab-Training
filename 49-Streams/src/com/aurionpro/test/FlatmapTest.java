package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapTest {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2, 3, 4);
		List<Integer> list2 = Arrays.asList(12, 13, 14, 2, 4);
		List<Integer> list3 = Arrays.asList(22, 32, 43,43,43);

		List<Integer> mergeList = new ArrayList<Integer>();
		mergeList.addAll(list1);
		mergeList.addAll(list2);
		mergeList.addAll(list3);

		System.out.println(mergeList);

		List<List<Integer>> newList = new ArrayList<List<Integer>>();
		newList.add(list1);
		newList.add(list2);
		newList.add(list3);
		System.out.println(newList);

		List<Integer> resultlist = new ArrayList<Integer>();
		for (List<Integer> l : newList) {
			for (Integer i : l) {
				if (!newList.contains(i))
					resultlist.add(i);
			}
		}
		System.out.println(resultlist);

		List<Integer> collect = newList.stream().flatMap(list -> list.stream()).distinct().collect(Collectors.toList());
		System.out.println("using stream" + collect);
	}

}
