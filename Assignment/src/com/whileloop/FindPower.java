package com.whileloop;

import java.util.Scanner;

public class FindPower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0,base,raise,power=1;
		System.out.println("Enter base");
		base=sc.nextInt();
		System.out.println("Enter raise");
		raise=sc.nextInt();
		while(i<raise) {
			power=power*base;
			i++;
		}
		System.out.println("Power:"+power);
	}
}
