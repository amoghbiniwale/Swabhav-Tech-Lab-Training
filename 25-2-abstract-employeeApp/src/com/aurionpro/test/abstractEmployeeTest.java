package com.aurionpro.test;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Salseman;

public class abstractEmployeeTest {

	public static void main(String[] args) {
		Manager manager = new Manager(01,"amogh",30000);
		printSalaryDetails(manager);
	
	
		Salseman salseman = new Salseman(02,"sam",20000);
		printSalaryDetails(salseman);
		
		Accountant accountant = new Accountant(03,"man",5000);
		printSalaryDetail(accountant);
	}
	private static void printSalaryDetail(Accountant accountant) {
		System.out.println("employee id: "+accountant.getEmployeeId());
		System.out.println("employee name "+accountant.getName());
		System.out.println("basic salary: "+accountant.basicSalary);
		System.out.println("employee CTC: "+accountant.calculateAnnualCTC());
		System.out.println("-------");
	}
	private static void printSalaryDetails(Salseman salseman) {
		System.out.println("emoloyee id : "+salseman.employeeId);
		System.out.println("emoloyee id : "+salseman.name);
		System.out.println("basic salary is :"+salseman.getBasicSalary());
		System.out.println("CTC is:"+salseman.calculateAnnualCTC());
		System.out.println("-------");
	}
	private static void printSalaryDetails(Manager manager) {
		System.out.println();
		System.out.println("empoloyee id: "+manager.getEmployeeId());
		System.out.println("employee name: "+manager.getName());
		System.out.println("basic salary is :"+manager.getBasicSalary());
		System.out.println("CTC is:"+manager.calculateAnnualCTC());
		System.out.println("-------");
	}
	
	
}
