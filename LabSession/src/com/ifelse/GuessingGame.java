package com.ifelse;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=10,guess,ct=1;
		for(;;) {
			System.out.println("Enter number");
			guess=sc.nextInt();
			if(num==guess) {
				break;
			}else if(guess<num) {
				System.out.println("Too Low! Please Enter Higher Number");
			}else if(guess>num) {
				System.out.println("Too High! Please Enter Lower Number");
			}
			ct++;
		}
		System.out.println("Congratulations! You have guessed the number in "+ct+" attempts");
	}
}
