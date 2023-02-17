package com.auronpro.test;

import java.util.ArrayList;
import java.util.List;

public class Region {

	private int id;
	private String name;

	List<Country> countries;

	public Region(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		countries= new ArrayList<Country>();
	}
	
	
	
	@Override
	public String toString() {
		return "Region [id=" + id + ", name=" + name + ", countries=" + countries + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<Country> getCountries() {
		return countries;
	}



//	public void setCountries(List<Country> countries) {
//		this.countries = countries;
//	}



	public void addCountryToList(Country country) {
		countries.add(country);
	}
	
	
	
	

}
