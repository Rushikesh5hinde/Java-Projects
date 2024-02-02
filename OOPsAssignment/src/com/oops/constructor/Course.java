package com.oops.constructor;

public class Course {
	private int courseId;
	private String courseName;
	
	public Course() {
		
	}
	public Course(int courseId,String courseName) {
		this.courseId=courseId;
		this.courseName=courseName;
	}
	public void setCourseId(int courseId) {
		this.courseId=courseId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseName(String courseName) {
		this.courseName=courseName;
	}
	public String getCourseName() {
		return courseName;
	}
}
