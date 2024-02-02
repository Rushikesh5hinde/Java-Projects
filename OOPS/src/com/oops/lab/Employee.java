package com.oops.lab;

public class Employee {
	private int id;
	private String ename;
	private double basicsal;
	private double pf;
	private double hra;
	private double da;
	private double netsal;
	private int deptno;
	
	public Employee() {
		
	}
	public Employee(int id,String ename,double basicsal,int deptno) {
		this();
		this.id=id;
		this.ename=ename;
		this.basicsal=basicsal;
		this.deptno=deptno;
	}
	public void calSal() {
		pf=basicsal*0.1;
		System.out.println("pf:"+pf);
		hra=basicsal*0.15;
		System.out.println("HRA:"+hra);
		da=basicsal*0.2;
		System.out.println("DA:"+da);
		
		netsal=basicsal-pf+hra+da;
		System.out.println("Net Salary:"+netsal);
	}
	public void displayEmployee() {
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee deptno:"+deptno);
		System.out.println("Basic Salary:"+basicsal);
		calSal();
	}
}
