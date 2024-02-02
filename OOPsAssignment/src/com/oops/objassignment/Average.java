package com.oops.objassignment;

public class Average {
	int num1;
	int num2;
	int num3;
	public void setValues(int num1,int num2,int num3) {
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	public double printAverage() {
		double average=(num1+num2+num3)/3;
		return average;
	}
}
