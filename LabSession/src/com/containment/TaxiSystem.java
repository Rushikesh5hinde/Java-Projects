package com.containment;

import java.util.Scanner;

public class TaxiSystem {
	Scanner sc=new Scanner(System.in);
	
	public void enterCarDetails(Car c) {
		System.out.println("Enter car no:");
		c.setCarNo(sc.nextInt());
		System.out.println("Enter car brand");
		c.setBrand(sc.next());
		System.out.println("Enter car model");
		c.setModel(sc.next());
		
		c.setDriver(new Driver());
		
		System.out.println("Enter Driver id:");
		c.getDriver().setDriverId(sc.nextInt());
		System.out.println("Enter driver name");
		c.getDriver().setName(sc.next());
		System.out.println("Enter driver aadhar:");
		c.getDriver().setAadharNo(sc.nextLong());
		System.out.println("Enter driver salary");
		c.getDriver().setSalary(sc.nextDouble());	
	}
	public void enterCarDetails(Car c,Driver d) {
		System.out.println("Enter car no:");
		c.setCarNo(sc.nextInt());
		System.out.println("Enter car brand");
		c.setBrand(sc.next());
		System.out.println("Enter car model");
		c.setModel(sc.next());
		
		System.out.println("Enter Driver id:");
		d.setDriverId(sc.nextInt());
		System.out.println("Enter driver name");
		d.setName(sc.next());
		System.out.println("Enter driver aadhar:");
		d.setAadharNo(sc.nextLong());
		System.out.println("Enter driver salary");
		d.setSalary(sc.nextDouble());
		
		c.setDriver(d);
	}
	public static void main(String[] args) {
		TaxiSystem obj1=new TaxiSystem();
//		Car c1=new Car();
//		obj1.enterCarDetails(c1);
//		System.out.println(c1);
		
//		Car c2=new Car();
//		Driver d=new Driver();
//		obj1.enterCarDetails(c2, d);
//		System.out.println(c2);
	}
}
