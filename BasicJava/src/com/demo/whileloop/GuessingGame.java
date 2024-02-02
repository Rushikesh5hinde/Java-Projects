package com.demo.whileloop;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=7,guess;
		while(true) {
			System.out.println("Guess number");
			guess=sc.nextInt();
			if(num==guess) {
				System.out.println("Congo! you have guessed the number");
				break;
			}else if(num>guess) {
				System.out.println("Too Low! Please Enter higher");
			}else {
				System.out.println("Too High! Please Enter lower");
			}
		}
	}
}
