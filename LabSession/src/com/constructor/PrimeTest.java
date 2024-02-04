package com.constructor;

import java.util.Scanner;

public class PrimeTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		char ch;
		do {
			System.out.println("Enter number");
			num=sc.nextInt();
			PrimeNumber p1=new PrimeNumber(num);
			if(p1.checkPrime()) {
				System.out.println("Prime");
			}else {
				System.out.println("Not Prime");
			}
			System.out.println("do you want to continue?? "
					+ "\nif yes then press y or to stop press n");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("--------------Thank You----------------");
	}
}
