package com.demo.conditionalstatement;

import java.util.Scanner;

public class PrizeTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number to get prize");
		num=sc.nextInt();
		if (num>=1 && num<=3) {
			System.out.println("Congratulations! you got laptop");
		}else if(num>=4 && num<=6) {
			System.out.println("Congratulations! you got pen");
		}else if(num>=7 && num<=10) {
			System.out.println("Congratulations! you got mobile");
		}else if(num>10) {
			System.out.println("Better luck next time!");
		}
			
	}
}
