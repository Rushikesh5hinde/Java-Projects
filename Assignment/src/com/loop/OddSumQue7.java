package com.loop;

import java.util.Scanner;

public class OddSumQue7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int end,start=1,sum=0;
		System.out.println("Enter ending number");
		end=sc.nextInt();
		System.out.println(oddSum(start, end));
	}
	public static int oddSum(int start,int end) {
		int sum=0;
		start=1;
		while(start<=end) {
			if(start%2==1) {
				sum=sum+start;
			}
			start++;
		}
		return sum;
	}
}
