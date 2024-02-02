package com.enhancedfor;

import java.util.Scanner;

public class EnhancedForLoop {
	public static void main(String[] args) {
		//cannot use:insert values inside array,refer to specific index,updation
		//can use:access value,traverse array
		
		int[] arr= {4,5,6,7,8,9};
		for(int x:arr) {
			System.out.println(x);
		}
		//x is reference point to value,we cannot change value but can access it
		
		Scanner sc=new Scanner(System.in);
		int[] arr2=new int[3];
		System.out.println("Enter values:");
		for(int y:arr2) {
			y=sc.nextInt();;	//we cannot add values inside array
		}
		for(int y:arr2) {
			System.out.println(y);
		}
		System.out.println("-------------------------------------------");
		
		
		//we can access the value
		
		int[] arr3= {1,2,3,4,5,6};
		int sum=0;
		for(int z:arr3) {
			if(z%2==0)
				sum+=z;
		}
		System.out.println(sum);
	}
}
