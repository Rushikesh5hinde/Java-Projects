package com.demo.home;

import java.util.Scanner;

public class RangePerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,start,end;
		System.out.println("Enter starting number");
		start=sc.nextInt();
		System.out.println("Enter ending number");
		end=sc.nextInt();
		for(i=start;i<=end;i++) {
			if(isPerfect(i))
				System.out.println(i);
		}
	}
	public static boolean isPerfect(int num) {
		int i,sum=0,temp=num;
		for(i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		return sum==temp;
	}
}
