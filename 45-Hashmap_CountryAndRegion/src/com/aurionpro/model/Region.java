package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private int regionId;
	private String regionName;
	private List<Country> countries;

	public Region(int regionId, String regionName) {
		this.regionId = regionId;
		this.regionName = regionName;
		countries = new ArrayList<Country>();
	}
	
	public void addCountries(Country country) {
		countries.add(country);
	}

	public List<Country> getCountries() {
		return countries;
	}
	
	public int getRegionId() {
		return regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	@Override
	public String toString() {
		return "\n\nRegion [regionId=" + regionId + ", regionName=" + regionName + ", countries=" + countries + "]\n";
	}
}
