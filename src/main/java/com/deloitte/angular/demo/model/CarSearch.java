package com.deloitte.angular.demo.model;

import java.util.List;

public class CarSearch {
	
	private int year;
	private List<String> makes;
	private List<String> models;
	
	public List<String> getModels() {
		return models;
	}
	public void setModels(List<String> models) {
		this.models = models;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public List<String> getMakes() {
		return makes;
	}
	public void setMakes(List<String> makes) {
		this.makes = makes;
	}
	
	
}
