package com.auronpro.test1;

import java.util.ArrayList;
import java.util.List;

import com.auronpro.test.Country;
import com.auronpro.test.Region;

public class countryRegionTest {
	public static void main(String[] args) {
		List<Region>regions = new ArrayList<>();
		
		regions.add(new Region(1,"Europe"));
		regions.add(new Region(2,"Asia"));
		regions.add(new Region(3,"africa"));
		regions.add(new Region(4,"middle east"));
		
		
		
		List<Country> countries = new ArrayList<>();
		countries.add(new Country("IT","Italy",1));
		countries.add(new Country("JP", "Japan", 3));
		countries.add(new Country("US", "United States of America", 2));
		countries.add(new Country("CA", "Canada", 2));
		countries.add(new Country("CA", "Canada", 2));
		countries.add(new Country("CN", "China", 3));
		countries.add(new Country("IN", "India", 3));
		countries.add(new Country("AU", "Australia", 3));
		countries.add(new Country("SG", "Singapore", 3));
		countries.add(new Country("UK", "United Kingdom", 1));
		countries.add(new Country("FR", "France", 1));
		countries.add(new Country("DE", "Germany", 1));
		countries.add(new Country("ZM", "Zambia", 4));
		countries.add(new Country("EG", "Egypt", 4));
		countries.add(new Country("BR", "Brazil", 2));
		countries.add(new Country("CH", "Switzerland", 1));
		countries.add(new Country("NL", "Netherlands", 1));
		countries.add(new Country("MX", "Mexico", 2));
		countries.add(new Country("KW", "Kuwait", 4));
		countries.add(new Country("IL", "Israel", 4));
		countries.add(new Country("DK", "Denmark", 1));
		countries.add(new Country("HK", "HongKong", 3));
		countries.add(new Country("NG", "Nigeria", 4));
		countries.add(new Country("AR", "Argentina", 2));
		countries.add(new Country("BE", "Belgium", 1));
		
		
		
		
		for(Country x:countries) {
			int id=x.getCountryID();
			regions.get(id-1).addCountryToList(x);		
	}
		
	System.out.println(regions);
//		"ZM", "Zambia", 4
//		"EG", "Egypt", 4
//		"BR", "Brazil", 2
//		"CH", "Switzerland", 1
//		"NL", "Netherlands", 1
//		"MX", "Mexico", 2
//		"KW", "Kuwait", 4
//		"IL", "Israel", 4
//		"DK", "Denmark", 1
//		"HK", "HongKong", 3
//		"NG", "Nigeria", 4
//		"AR", "Argentina", 2
//		"BE", "Belgium", 1
		
	}
}
