package com.student2;

public class StudentDemo {
	public static void main(String[] args) {
		Student stud[]=new Student[4];
		//using constructors
		stud[0]=new Student(101, "Onkar", new double[] {90,91.1,92}, new Course(1, "java"));
		stud[1]=new Student(102, "Rushi", new double[] {80,91,92}, new Course(1, "java"));
		stud[2]=new Student(103, "Rahul", new double[] {95,91.1,96}, new Course(2, ".net"));
//		stud[3]=new Student(104, "Pravin", new double[] {90.1,91,92}, new Course(2, ".net"));
		
		//using getters and setters
		stud[3]=new Student();
		stud[3].setId(104);
		stud[3].setName("Pravin");
		stud[3].setMarks(new double[] {90.1,91,92});
		stud[3].setCourse(new Course(2, ".net"));
		
		for(Student s:stud) {
			System.out.println(s);
		}
		System.out.println("--------------------");
		
		stud[0].getCourse().setCname("Full Stack");
		
		for(Student s:stud) {
			System.out.println(s);
		}
	}
}
