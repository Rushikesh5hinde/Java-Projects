package com.oops.constructor;

public class CourseTest {
	public static void main(String[] args) {
		Course c1=new Course(11, "Java");
		c1.setCourseId(101);
		System.out.println(c1.getCourseId());
	}
}
