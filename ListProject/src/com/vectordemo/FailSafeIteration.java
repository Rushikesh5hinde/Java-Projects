package com.vectordemo;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafeIteration {
	public static void main(String[] args) {
		Vector<Integer>num=new Vector<Integer>();
		
		num.add(10);
		num.add(20);
		num.add(10);
		num.add(40);
		num.add(50);
		num.add(60);
		
		System.out.println(num);
		
		//Fail Safe Iterator
		Enumeration<Integer> en=num.elements();
		
		while(en.hasMoreElements()) {
			if(en.nextElement()==40) {
				num.add(34);
			}
		}
		
		System.out.println(num);
	}
}
