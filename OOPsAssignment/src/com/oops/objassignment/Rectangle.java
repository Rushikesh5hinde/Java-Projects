package com.oops.objassignment;

public class Rectangle {
	double length;
	double breadth;
	
	public void setValues(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public double returnArea(double len,double bd) {
		this.length=len;
		this.breadth=bd;
		
		double area=length*breadth;
		return area;
	}
}
