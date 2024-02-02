package com.demo.conditionalstatement;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year;
		//String res;
		System.out.println("Enter year");
		year=sc.nextInt();
		
		//ternary operator
		
		//res=((year%4==0 && year%100!=0) || (year%400==0))?"Leap Year":"Not a leap year";
		//System.out.println(year+":"+res);
		
		//using if-else-if ladder
		
//		if(year%4==0 && year%100!=0)
//		{
//			System.out.println(year+" is leap!");
//		}else if(year%400==0) {
//			System.out.println(year+" is leap!");
//		}else {
//			System.out.println(year+" is not leap!");
//		}
		
		if(year%4==0)
		{
			if(year%100!=0)
			{
				System.out.println(year+" is leap!");
			}else if(year%400==0){
				System.out.println(year+" is leap!");
			}else {
				System.out.println(year+" is not leap!");
			}
		}
	}
}
