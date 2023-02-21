package com.aurionpro.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetTest {
	 public static void main(String args[]){  
		  HashSet<String> set=new HashSet<String>();  
		  set.add("amogh");  
		  set.add("sam");  
		  set.add("Ravi");  
		  set.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
}
