package com.arraylist1;

import java.util.ArrayList;

public class EmpArrayList {
	public static void main(String[] args) {
		ArrayList<Emp>emp1=new ArrayList<Emp>();
		emp1.add(new Emp(101, "Kunal", 20000, new Dept(11, "HR")));
		emp1.add(new Emp(102, "Neha", 15000, new Dept(12, "Dev")));
		emp1.add(new Emp(103, "Suraj", 30000, new Dept(13, "Testing")));
		emp1.add(new Emp(104, "Abhay", 25000, new Dept(11, "HR")));
		
		for(Emp e:emp1) {
			System.out.println(e);
		}
	}
}
