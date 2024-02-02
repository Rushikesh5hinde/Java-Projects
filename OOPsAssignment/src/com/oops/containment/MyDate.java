package com.oops.containment;

public class MyDate {
	private int day;
	private String month;
	private int year;
	
	public MyDate() {
		
	}
	public MyDate(int day,String month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toString() {
		return "MyDate:"+day+" "+month+" "+year;
	}
}
