package com.method;

import java.util.Scanner;

public class PrintProductDigits {
	
	public static int digitProduct(int num) {
		int res=1;
		while(num!=0) {
			int rem=num%10;
			res=res*rem;
			num/=10;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		System.out.println("Product:"+digitProduct(num));
	}
}
