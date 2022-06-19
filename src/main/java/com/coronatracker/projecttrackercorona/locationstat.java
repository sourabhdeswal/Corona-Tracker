package com.coronatracker.projecttrackercorona;

public class locationstat {

	private String states;
	private String  country;
	private int latesttotalcases;
	private int difference;
	
	
	
	@Override
	public String toString() {
		return "locationstat [states=" + states + ", country=" + country + ", latesttotalcases=" + latesttotalcases
				+ "]";
	}

	
	
	public String getStates() {
		return states;
	}
	public void setStates(String states) {
		this.states = states;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatesttotalcases() {
		return latesttotalcases;
	}
	public void setLatesttotalcases(int latesttotalcases) {
		this.latesttotalcases = latesttotalcases;
	}



	public int getDifference() {
		return difference;
	}



	public void setDifference(int difference) {
		this.difference = difference;
	}
}