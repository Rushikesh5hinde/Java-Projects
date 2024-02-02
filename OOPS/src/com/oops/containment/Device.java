package com.oops.containment;

public class Device {
	private int did;
	private String dname;
	private double price;
	private Charger charger;
	
	public Device() {
		
	}
	public Device(int did,String dname,double price,Charger charger) {
		this();
		this.did=did;
		this.dname=dname;
		this.price=price;
		this.charger=charger;
	}
	public void setDid(int did) {
		this.did=did;
	}
	public int getDid() {
		return did;
	}
	public void setDname(String dname) {
		this.dname=dname;
	}
	public String Dname() {
		return dname;
	}

}
