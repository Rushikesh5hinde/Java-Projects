package com.loop;

import java.util.Scanner;

public class EvenSumQue6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int end,start=1;
		System.out.println("Enter ending number");
		end=sc.nextInt();
		System.out.println(evenSum(start, end));
	}
	public static int evenSum(int start,int end) {
		int sum=0;
		while(start<=end) {
			if(start%2==0) {
				sum=sum+start;
			}
			start++;
		}
		return sum;
	}
}
