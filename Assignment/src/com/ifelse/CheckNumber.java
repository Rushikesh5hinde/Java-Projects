package com.ifelse;

import java.util.Scanner;

public class CheckNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number:");
		num=sc.nextInt();
		if(num<0)
		{
			System.out.println(num+" is negative!");
		}else if(num>0){
			System.out.println(num+" is positive!");
		}else{
			System.out.println(num+" is zero");
		}
	}
}
