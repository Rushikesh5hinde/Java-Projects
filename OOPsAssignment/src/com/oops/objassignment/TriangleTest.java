package com.oops.objassignment;

public class TriangleTest {
	public static void main(String[] args) {
		Triangle t1=new Triangle();
		t1.setValues(3, 4, 5);
		t1.printArea();
		t1.printPerimeter();
		Triangle t2=new Triangle();
		t2.printArea(3, 4, 5);
		t2.printPerimeter(3, 4, 5);
	}
}
