package com.oops.objassignment;

public class Area {
	double length;
	double breadth;
	
	public void setDim(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public double getArea() {
		double area=length*breadth;
		return area;
	}
}
