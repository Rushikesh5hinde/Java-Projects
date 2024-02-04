package com.method_ifelse;

import java.util.Scanner;

public class PrintTemp13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp;
		System.out.println("Enter Temperature in centigrade");
		temp=sc.nextInt();
		checkTemp(temp);
	}
	public static void checkTemp(int temp) {
		if(temp<0) {
			System.out.println("Freeing Wheather");
		}else if(temp>=0 && temp<10) {
			System.out.println("Very Cold Weather");
		}else if(temp>=10 && temp<20) {
			System.out.println("Cold Weather");
		}else if(temp>=20 && temp<30) {
			System.out.println("Normal Temperature");
		}else if(temp>=30 && temp<40) {
			System.out.println("Hot Temperature");
		}else if(temp>=40) {
			System.out.println("Very Hot");
		}
	}
}
