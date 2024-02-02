package com.oops.assigmentoops;

public class BoxTest {
	public static void main(String[] args) {
		Box b1=new Box();
		
		double volume=b1.boxVolume(10, 10, 10);
		System.out.println(volume);
		
		double area=b1.areaRectangle(4, 5);
		System.out.println(area);
	}
}
