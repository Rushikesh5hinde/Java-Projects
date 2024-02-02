package com.oops.containment;

public class Address {
	private String city;
	private String state;
	private String country;
	
	public Address() {
		
	}
	public Address(String city,String state,String country) {
		this.city=city;
		this.state=state;
		this.country=country;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getCity() {
		return city;
	}
	public void setState(String state) {
		this.state=state;
	}
	public String getState() {
		return state;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	public String getCountry() {
		return country;
	}
	public String toString() {
		return "Address:"+city+" "+state+" "+country;
	}
}
