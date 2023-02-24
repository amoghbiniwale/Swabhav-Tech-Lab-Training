package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.aurionpro.model.Employee;

public class MinMaxTest {

	public static void main(String[] args) {
		List<Employee> employee = Arrays.asList(new Employee(1,"amogh",1000000,"Payment"),
				new Employee(2,"akshay",200000,"Cash Management"),
				new Employee(3,"prathmesh",300000,"HR"));
		
		Optional<Employee> max = employee.stream().max(Comparator.comparing(Employee::getSalary));
		
		
		if(max.isPresent()) {
		System.out.println(max.get());
	}
		
		employee.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
		
	}

}
