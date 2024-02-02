package com.oops.containment;

import java.util.Scanner;

public class PersonTest {
	Scanner sc=new Scanner(System.in);
	
	public void enterPersonDetails(Person p) {
		System.out.println("Enter person name:");
		p.setPname(sc.next());
		System.out.println("Enter gender");
		p.setGender(sc.next());
		System.out.println("Enter age");
		p.setAge(sc.nextInt());
		
		Address a=new Address();
		System.out.println("Enter city");
		a.setCity(sc.next());
		System.out.println("Enter state");
		a.setState(sc.next());
		System.out.println("Enter country");
		a.setCountry(sc.next());
		
		p.setAddress(a);
	}
	public static void main(String[] args) {
		PersonTest obj=new PersonTest();
		Person p=new Person();
		obj.enterPersonDetails(p);
		System.out.println(p);
	}
}
