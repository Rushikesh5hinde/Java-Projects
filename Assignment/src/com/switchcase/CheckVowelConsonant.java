package com.switchcase;

import java.util.Scanner;

public class CheckVowelConsonant {
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
		case 'I':
		case 'i':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(choice+" is vowel!");
			break;
		default:
			System.out.println(choice+" is consonant!");
		}
	}
}
