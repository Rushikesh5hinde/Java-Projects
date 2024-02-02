package com.oops.classobject;
class Employee {
	int eid;
	String ename;
	double esal;
	
	public void show() {
		System.out.println("Employee Id:"+eid);
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Salary:"+esal);
		System.out.println("-----------------------------------");
	}
}
public class TestEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.eid=101;
		e1.ename="rahul";
		e1.esal=30000;
		
		Employee e2=new Employee();
		e2.eid=102;
		e2.ename="shreya";
		e2.esal=35000;
		
		e1.show();
		e2.show();
		
	}
}
