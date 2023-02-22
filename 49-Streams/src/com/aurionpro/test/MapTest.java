package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class MapTest {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(10,12,25,20,33,30,47);
		System.out.println(numberList);
		List<Integer> collect = numberList.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println("squre of numberList"+collect);
		
		List<Account>accountList = Arrays.asList(
				new Account(101,"Amogh",20000),
				new Account(102,"sankalp",30000),
				new Account(103,"sam",40000)
				);
		
		accountList = accountList.stream().map(n->new Account(n.getId(),n.getName(),n.getBalance()*1.06)).collect(Collectors.toList());
		System.out.println("account details balance*1.06"+accountList);
		
		List<Account>accountList2=accountList.stream().filter(n->n.getId()==101).collect(Collectors.toList());
			System.out.println("Account number is"+accountList2);
			System.out.println();
			
			List<Integer>collect2 = numberList.stream().filter(n->n %2==0).map(n->n*n).collect(Collectors.toList());
			System.out.println("squre of those number which are divisable by 2 in numberList"+collect2);
	}
	

	
	
}
