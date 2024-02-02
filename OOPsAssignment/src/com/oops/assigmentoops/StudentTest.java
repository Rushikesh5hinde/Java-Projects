package com.oops.assigmentoops;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		Student obj=new Student();
		for(i=1;i<=2;i++) {
			System.out.println("Enter student id");
			obj.sId=sc.nextInt();
			System.out.println("Enter student name");
			obj.sName=sc.next();
			
			System.out.println(obj.sId);
			System.out.println(obj.sName);
			System.out.println("---------------------");
		}
//		Student s1=new Student();
		
//		s1.setDetails(101, "Rohit", 90);
		//s1.display();
		
//		Student s2=new Student();
//		s2.setDetails(102, "Supriya", 87);
		//s2.display();
		//anonymous object
//		new Student();
		
//		Student s4=new Student();
//		Student s5=new Student();
//		
//		System.out.println(s4.sId);
//		System.out.println(s4.sName);
//		System.out.println(s4.sMarks);
//		
//		s4.sId=105;
//		s4.sName="Ramesh";
//		s4.sMarks=55;
//		
//		System.out.println(s4.sId);
//		System.out.println(s4.sName);
//		System.out.println(s4.sMarks);
//		
//		s5.sId=106;
//		s5.sName="Suresh";
//		s5.sMarks=75;
//		
//		System.out.println(s5.sId);
//		System.out.println(s5.sName);
//		System.out.println(s5.sMarks);
	}
}
