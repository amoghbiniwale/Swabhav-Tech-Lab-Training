package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> student = Arrays.asList(new Student (101,"amogh",Arrays.asList("football","cricket","web series")),
				new Student (102,"sam",Arrays.asList("acting","dancing","cooking")),
				new Student (103,"ram",Arrays.asList("cricket","movies","reading"))		
				);
		
		List<Student> collect = student.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> collect2 = student.stream().map(n->n.getName()).distinct().collect(Collectors.toList());
			System.out.println(collect2);	
			
			List<String> collect3 = student.stream().map(n->n.getHobbies()).flatMap(list->list.stream()).distinct().collect(Collectors.toList());
			System.out.println(collect3);
			
	}

}
