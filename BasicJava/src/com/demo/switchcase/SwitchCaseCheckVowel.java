package com.demo.switchcase;

import java.util.Scanner;

public class SwitchCaseCheckVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char choice;
		System.out.println("Enter choice");
		choice=sc.next().charAt(0);
		switch(choice) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("It is vowel!");
			break;
			default:
				System.out.println("It is consonant!");
		}
	}
}
