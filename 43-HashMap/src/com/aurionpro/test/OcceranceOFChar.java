package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class OcceranceOFChar {
	
	public static void main(String[] args) {
		//String str = "amogh";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		Map<Character,Integer> map = new HashMap<>();
		
		for(Character c :str.toLowerCase().toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				if(map.containsKey(c)) {
					map.put(c, map.get(c)+1);
				}else {
					map.put(c, 1);
				}
			}
		}
		map.forEach((key,value)->System.out.println(key+ "  "+value));
	}
}
