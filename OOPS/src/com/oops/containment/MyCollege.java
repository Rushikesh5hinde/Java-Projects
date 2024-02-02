package com.oops.containment;

public class MyCollege {
	public static void main(String[] args) {
		
		Course c1=new Course(101, "Java", 50000);
		Course c2=new Course(102,".net",45000);
		Course c3=new Course(103,"React",40000);
//		
//		Student s1=new Student(1, "ravi", 97, c1);
//		Student s2=new Student(2, "rakesh", 85, c1);
//		Student s3=new Student(3, "madhuri", 67, c2);
//		Student s4=new Student(4, "shweta", 90, c3);
//		Student s5=new Student(5, "jitesh", 89, c3);
//		Student s6=new Student(6, "aarav", 78, c3);
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);
//		System.out.println(s6);
		
//		Student s1=new Student(1, "Rohit", 76, new Course(101,"Java",50000));
//		Student s2=new Student(2, "shweta", 86, new Course(101,"Java",50000));
//		System.out.println(s1);
//		System.out.println(s2);
		
		Student s1=new Student();
		s1.setSid(1);
		s1.setSname("rohit");
		s1.setMarks(67);
		s1.setCourse(c1);
		
		System.out.println(s1);

		Student s2=new Student();
		s2.setSid(2);
		s2.setSname("shweta");
		s2.setMarks(67);
		s2.setCourse(c1);
		
		System.out.println(s2);
		
//		System.out.println(s2.getCourse().hashCode());
//		System.out.println(s2.getCourse().hashCode());
		
//		s2.getCourse().setFees(60000);
//		
//		System.out.println(s1.getCourse().getFees());
		
		
	}
}
