package com.varargs;

public class VarargsDemo {
	public static void calSum(int[] a) {
		int sum=0;
		for(int x:a) {
			sum+=x;
		}
		System.out.println("Sum:"+sum);
	}
	//using varargs
	public static void findSum(int ...a) {
		int sum=0;
		for(int x:a) {
			sum+=x;
		}
		System.out.println("Sum:"+sum);
	}
	public static void main(String[] args) {
		int[] a1= {1,2,3};
		int[] a2= {5,6};
		int[] a3= {7,8,9,10};
		
		calSum(a1);
		calSum(a2);
		calSum(a3);
		
		System.out.println("----------------------");
		
		findSum(1,2,3);
		findSum(5,6);
		findSum(7,8,9,10);
	}
}
