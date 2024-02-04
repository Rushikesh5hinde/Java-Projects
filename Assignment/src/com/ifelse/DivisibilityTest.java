package com.ifelse;

import java.util.Scanner;

public class DivisibilityTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number you want to check");
		num=sc.nextInt();
		if(num%5==0)
		{
			if(num%11==0)
			{
				System.out.println(num+" is divisible by 5 and 11");
			}else{
				System.out.println(num+" is only divisible by 5");
			}
		}else if(num%11==0)
		{
			System.out.println(num+" is only divisible by 11");
		}else{
			System.out.println(num+" is not divisible by 5 and 11");
		}
	}
}
