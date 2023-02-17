package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		map.put(1, "pineapple");
		
		System.out.println("Hash map : "+map);
		System.out.println("for iterations...");
		
//		Set<Entry<Integer, String>> entrySet = map.entrySet();
//		for(Entry<Integer, String> set : map.entrySet()) {
//			System.out.println(set.getKey()+""+set.getValue());
//		}
		map.forEach((key,value)->System.out.println(key+" : "+value));
		
		System.out.println("remove");//remove
		map.remove(1);
		System.out.println(map);
		
		System.out.println("remove object by key");
//		//remove object by key 
//		map.containsValue("Banana");
//		if(map.containsValue("Banana"))
//			map.remove(3);	
//		map.forEach((key,value)->System.out.println(key+" :"+value));
		
//		for(Entry<Integer , String> x: map.entrySet()) {
//			if(((Entry<Integer, String>) map).getValue().equals("Apple")) {
//				map.remove(x.getKey());
//			}
		
		int Ikey = 0;
		for(Entry<Integer,String> x : map.entrySet()) {
			if(x.getValue().equals("Apple")) {
				Ikey = x.getKey();
			}
		}
		map.remove(Ikey);
		System.out.println(map);
}
	
}
