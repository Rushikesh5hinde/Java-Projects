package com.test3;

import java.util.Scanner;

public class TwinPrimes {
	public static boolean checkPrime(int num){
		if(num<=1)
			return false;
		else{
			int ct=0;
			for(int i=2;i<=num/2;i++){
			
				if(num%i==0){
					ct++;
					break;
				}
			}
			return ct==0;

		}
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second Number");
		num2=sc.nextInt();

		if(checkPrime(num1) && checkPrime(num2) && Math.abs(num1-num2)==2){
			System.out.println("Twin Primes");
		}else{
			System.out.println("Not twin Primes");
		}
	}
}
