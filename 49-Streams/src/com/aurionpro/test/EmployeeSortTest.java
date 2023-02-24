package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmployeeSortTest {

	public static void main(String[] args) {
		List<Employee> employee = Arrays.asList(new Employee(1,"amogh",1000000,"Payment"),
				new Employee(2,"akshay",200000,"Cash Management"),
				new Employee(3,"prathmesh",300000,"HR"));
		
		List<Integer> sortBySalary = employee.stream().map(n->n.getSalary()).sorted().collect(Collectors.toList());
		System.out.println(sortBySalary);
		
		List<String> sortBySalary1 = employee.stream().map(n->n.getDeparatment()).sorted().collect(Collectors.toList());
		System.out.println(sortBySalary1);
		
		System.out.println("-------------------------------");
		
		List<Employee> empListSalary = employee.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		System.out.println(empListSalary);
		List<Employee> empListByDept = employee.stream().sorted(Comparator.comparing(Employee::getDeparatment)).collect(Collectors.toList());
		
		System.out.println(empListByDept);
		System.out.println();
		empListByDept.forEach(System.out::println);
	}
}
