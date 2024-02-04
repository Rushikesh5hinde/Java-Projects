package com.test2;

import java.util.Scanner;

public class CheckPrime {
	public static boolean checkPrime(int num){
		if(num==0 || num==1){
			return false;
		}else{
			int ct=0,i;
			for(i=2;i<=num/2;i++){
				if(num%i==0){
				ct++;
				break;
				}
			}
			return ct==0;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		if(checkPrime(num))
			System.out.println(num+" is Prime");
		else
			System.out.println(num+" is not prime");
	}
}
