package com.method;

import java.util.Scanner;

public class PrintOutput {
	public static int showOutput(int num) {
		int temp=num;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
		int res=temp-rev;
		if(res>0) {
			return res;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		System.out.println("Output: "+showOutput(num));
	}
}
