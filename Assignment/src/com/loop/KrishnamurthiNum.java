package com.loop;

import java.util.Scanner;

public class KrishnamurthiNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		if(checkKrishnamurthi(num)) {
			System.out.println(num+" is Krishnamurthi number");
		}else {
			System.out.println(num+" is not Krishnamurthi number");
		}
	}
	public static boolean checkKrishnamurthi(int num) {
		int sum=0;
		int temp=num;
		while(num!=0) {
			int rem=num%10;
			sum=sum+findFactorial(rem);
			num/=10;
		}
		return temp==sum;
	}
	public static int findFactorial(int num) {
		int fact=1,i=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		return fact;
	}
}
