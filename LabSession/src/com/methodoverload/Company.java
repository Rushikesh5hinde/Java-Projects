package com.methodoverload;

public class Company {
	public static void main(String[] args) {
		//using anonymous department
		
		/*Employee e1=new Employee(11, "Rohit", 40000, new Department(101, "Sales"));
		Employee e2=new Employee(12, "Shreya", 44000, new Department(102, "HR"));
		Employee e3=new Employee(13, "Subodh", 35000, new Department(103, "Quality"));
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);*/
		
		//using department object : using constructor
	/*	Department d1=new Department(101, "Sales");
		Department d2=new Department(102, "HR");
		Department d3=new Department(101, "Quality");
		
		Employee e1=new Employee(11, "Rohit", 40000, d1);
		Employee e2=new Employee(12, "Shreya", 44000, d2);
		Employee e3=new Employee(13, "Subodh", 35000, d3);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);	*/
		
		//using getter and setter: giving values from your own
		
		Department d1=new Department();
		d1.setDid(101);
		d1.setDeptName("Sales");
		
		Department d2=new Department();
		d2.setDid(102);
		d2.setDeptName("HR");
		
		Employee e1=new Employee();
		e1.setEid(1);
		e1.setEmpName("Rohit");
		e1.setSalary(40000);
		e1.setDepartment(d1);
		
		Employee e2=new Employee();
		e2.setEid(2);
		e2.setEmpName("Shreya");
		e2.setSalary(44000);
		e2.setDepartment(d2);
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1.getDepartment().hashCode());
		System.out.println(e2.getDepartment().hashCode());
	}
}
