package com.loop;

import java.util.Scanner;

public class PrintPowerQue14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int base,index;
		System.out.println("Enter base");
		base=sc.nextInt();
		System.out.println("Enter index");
		index=sc.nextInt();
		
		System.out.println("Power:"+power(base, index)
		);
	}
	public static int power(int base,int index) {
		int power=1,i=0;
		while(i<index) {
			power*=base;
			i++;
		}
		return power;
	}
}
