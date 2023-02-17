package com.auronpro.test;

public class Country {
	private String countryCode;
	private String countryName;
	private int countryID;

	
	@Override
	public String toString() {
		return "Country [countryCode=" + countryCode + ", countryName=" + countryName + ", countryID=" + countryID
				+ "]";
	}

	public Country(String countryCode, String countryName, int countryID) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.countryID = countryID;
	}

	public int getCountryID() {
		return countryID;
	}

	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
