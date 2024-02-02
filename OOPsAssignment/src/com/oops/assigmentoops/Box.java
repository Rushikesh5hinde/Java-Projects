package com.oops.assigmentoops;

public class Box {
	double length;
	double width;
	double height;
	
	public double boxVolume(double l,double w,double h) {
		length=l;
		width=w;
		height=h;
		
		return (length*width*height);
	}
	public double areaRectangle(double l,double w) {
		length=l;
		width=w;
		
		return length*width;
	}
}
