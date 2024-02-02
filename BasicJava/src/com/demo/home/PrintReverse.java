package com.demo.home;
//take a range from 151 to 159 and print reverse
import java.util.Scanner;

public class PrintReverse {
	public static int printReverse(int num) {
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start,end;
		System.out.println("Enter starting number");
		start=sc.nextInt();
		System.out.println("Enter ending number");
		end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			System.out.println(i+" = "+printReverse(i));
		}
	}
}
