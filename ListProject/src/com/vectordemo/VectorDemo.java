package com.vectordemo;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer>num=new Vector<Integer>();
		System.out.println(num.size());//0
		System.out.println(num.capacity());//10
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		System.out.println("-----------------------");
		System.out.println(num.size());//5
		System.out.println(num.capacity());//10
		
		
		//we can manually set capacity and increment
		
		Vector<Integer> v1=new Vector<Integer>(3,10);
		
		System.out.println(v1.size());//0
		System.out.println(v1.capacity());//3
		v1.add(10);
		v1.add(20);
		v1.add(30);
		
		System.out.println("--------------------------");
		System.out.println(v1.size());//3
		System.out.println(v1.capacity());//3
		
		v1.add(40);
		System.out.println("-----------------------");
		System.out.println(v1.size());//4
		System.out.println(v1.capacity());//13
		
		System.out.println(v1);
		
		System.out.println("------------------------");
		
		//methods
		
		//retrieve element
		System.out.println(v1.get(2));
		System.out.println(v1.elementAt(2));
		
		System.out.println("-------------------");
		//replace element
		v1.set(1, 100);
		System.out.println(v1);
		
		v1.setElementAt(200, 2);
		
		System.out.println(v1);
		
		System.out.println("------------------------");
		//remove element
		System.out.println(v1.remove(3));
		
		v1.removeElementAt(2);
		System.out.println(v1);
	}
}
