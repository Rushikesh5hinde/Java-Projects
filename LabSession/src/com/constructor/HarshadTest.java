package com.constructor;

import java.util.Scanner;

public class HarshadTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		char ch;
		do {
			System.out.println("Enter number");
			num=sc.nextInt();
			HarshadNum obj=new HarshadNum(num);
			if(num>0) {
				if(obj.isHarshad())
					System.out.println(obj.num+" is Harshad number");
				else
					System.out.println(obj.num+" is not a Harshad number");
			}else
				System.out.println("Please provide correct Input");
			
			System.out.println("Do you want to continue??");
			System.out.println("if yes press y or to stop press n");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("----------------END---------------------");
	}
}
