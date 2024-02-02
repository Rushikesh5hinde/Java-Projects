package com.oops.overriding;
class Programmer{
	void workingHours() {
		System.out.println("provide details");
	}
}
class Employee extends Programmer{
	@Override
	void workingHours() {
		System.out.println("working hours:8.5 hrs");
	}
}
public class ProgrammerDemo {
	public static void main(String[] args) {
		Programmer p;
		p=new Employee();
		p.workingHours();
	}
}
