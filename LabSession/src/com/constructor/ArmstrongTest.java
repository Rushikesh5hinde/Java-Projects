package com.constructor;

import java.util.Scanner;

public class ArmstrongTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num=sc.nextInt();
		
		Armstrong obj=new Armstrong(num);
		if(obj.isArmstrong())
			System.out.println("Armstrong");
		else
			System.out.println("is not an Armstrong");
	}
}
