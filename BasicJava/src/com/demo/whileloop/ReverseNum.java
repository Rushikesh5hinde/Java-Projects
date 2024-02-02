package com.demo.whileloop;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,sum=0;
		System.out.println("Enter number");
		num=sc.nextInt();//123
		while(num!=0) {
			sum=(sum*10)+(num%10);
			num/=10;
		}
		System.out.println("Reverse Number:"+sum);
	}
}
