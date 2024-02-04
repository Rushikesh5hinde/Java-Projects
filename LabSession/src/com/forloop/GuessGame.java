package com.forloop;

import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,num=5,guess;
		for(i=0;i<3;i++) {
			System.out.println("Enter number");
			guess=sc.nextInt();
			if(guess==num) {
				System.out.println("Congratulations!! You have guessed the number!");
				return;
			}else if(guess<num) {
				System.out.println("Too Low! Enter Higher Number");
			}else if(guess>num) {
				System.out.println("Too High! Enter Lower Number");
			}
		}
		System.out.println("You have reached maximum attempts! Please try again!");
		
	}
}
