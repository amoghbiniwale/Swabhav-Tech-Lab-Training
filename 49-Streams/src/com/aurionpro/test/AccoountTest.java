package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccoountTest {

	public static void main(String[] args) {
		List<Account>accountList = Arrays.asList(
				new Account(101,"Amogh",20000),
				new Account(102,"sankalp",30000),
				new Account(103,"sam",40000)
				);
		
			List<Account> collect = accountList.stream().filter(n->n.getBalance()>=10000).collect(Collectors.toList());
			System.out.println(collect);
			
	}

}
