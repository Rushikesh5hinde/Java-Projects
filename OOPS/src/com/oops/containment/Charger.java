package com.oops.containment;

public class Charger {
	private int cid;
	private String brand;
	private double capacity;
	
	public Charger() {
		
	}
	public Charger(int cid,String brand,double capacity) {
		this();
		this.cid=cid;
		this.brand=brand;
		this.capacity=capacity;
	}
	public void setCid(int cid) {
		this.cid=cid;
	}
	public int getCid() {
		return cid;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setCapacity(double capacity) {
		this.capacity=capacity;
	}
	public double getCapacity() {
		return capacity;
	}
	public String toString() {
		return "Id:"+cid+" Brand:"+brand+" Capacity:"+capacity;
	}
}
