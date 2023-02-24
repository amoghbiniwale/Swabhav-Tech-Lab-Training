package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameStreams {

	public static void main(String[] args) {
		// a.using names.stream().forEach
		Stream<String> names = Stream.of("Jayesh", "Nimesh", "Mahesh", "Ramesh");
		names.forEach(System.out::println);
		System.out.println("---------------------------");
		
		// b. using Arrays.asList(names).forEach
		List<String> names2 = Arrays.asList("Jayesh", "Nimesh", "Mahesh", "Ramesh");
		names2.stream().forEach(System.out::println);
		System.out.println("----------------------------");

		// c. using static reference method
		List<String> names3 = new ArrayList<String>();
		names3.add("jayesh");
		names3.add("Nimesh");
		names3.add("Mahesh");
		names3.add("Ramesh");

		for (String x : names3) {
			System.out.println(x);
		}
		System.out.println("-------------------------------");

		// 3. String[] names= {"Jay","Nimesh","Mark","Mahesh","Ramesh"};
//		a. print names of first 3 students sorted in ascending order		
		
		List<String> list = Arrays.asList("Jay", "Nimesh", "Mahesh", "Ramesh");
		List<String> sortByName = list.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted list" + sortByName);
		System.out.println("-------------------------------");

		// b. print names of first 3 students sorted in ascending order if their names
		// contain 'a'
		List<String> sortByName2 = list.stream().filter(n -> n.contains("a")).sorted().collect(Collectors.toList());
		System.out.println("names contain char a " + sortByName2);
		System.out.println("-------------------------------");

		// c. print names of students sorted in descending order
		List<String> sortByName3 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("list in reverse order" + sortByName3);
		System.out.println("-------------------------------");

		// d. print first 3 characters of names of students
		
		

		// e. print the names of the students that contains less than or equal to 4
		// characters
		List<String> sortByName4 = list.stream().filter(n -> n.length() <= 4).collect(Collectors.toList());
		System.out.println("Names of students less than 4 of equal characters "+sortByName4);

		// 5.Create an integer arrayList
		// a. Find min and max in Integer arrayList
		
		List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50, 25, 35, 45);
		
		Optional<Integer> minNumber = list1.stream().min((i, j) -> i.compareTo(j));
		System.out.println("minimum value is:"+minNumber);
		
		Optional<Integer> maxNumber = list1.stream().max((i, j) -> i.compareTo(j));
		System.out.println("minimum value is:"+maxNumber);
		
		

	}

}
