package com.method_ifelse;

import java.util.Scanner;

public class PrintWeekDay {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter week number");
		num=sc.nextInt();
		printWeekDay(num);
	}
	public static void printWeekDay(int num) {
		if(num==1) {
			System.out.println("Monday");
		}else if(num==2) {
			System.out.println("Tuesday");
		}else if(num==3) {
			System.out.println("Wednesday");
		}else if(num==4) {
			System.out.println("Thursday");
		}else if(num==5) {
			System.out.println("Friday");
		}else if(num==6) {
			System.out.println("Saturday");
		}else if(num==7) {
			System.out.println("Sunday");
		}
	}
}
