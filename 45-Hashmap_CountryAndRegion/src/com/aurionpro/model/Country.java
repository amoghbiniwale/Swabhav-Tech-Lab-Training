package com.aurionpro.model;

public class Country {
	private String countryCode;
	private String countryName;
	private int countryRegion;

	public Country(String countryCode, String countryName, int countryRegion) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.countryRegion = countryRegion;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public int getCountryRegion() {
		return countryRegion;
	}

	@Override
	public String toString() {
		//return "\nCountries [countryCode=" + countryCode + ", countryName=" + countryName + ", countryRegion="
				//+ countryRegion + "]";
		return "\n["+countryCode +"-"+ countryName+"]";
	}
}
