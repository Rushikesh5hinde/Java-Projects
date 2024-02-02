package com.demo.conditionalstatement;

import java.util.Scanner;

public class DemoIfElse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		if(num%4==0)
		{
			if(num%6==0)
			{
				System.out.println(num+ " is divisible by 4 and 6");
			}else {
				System.out.println(num+" is only divisible by 4");
			}
		}else if(num%6==0)
		{
			System.out.println(num+" is only divisible by 6");
		}else {
			System.out.println(num+" is not divisible by 4 and 6");
		}
	}
}
