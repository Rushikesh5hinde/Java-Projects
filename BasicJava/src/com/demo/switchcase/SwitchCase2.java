package com.demo.switchcase;

import java.util.Scanner;

public class SwitchCase2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char choice;
		System.out.println("---------WELCOME----------");
		System.out.println("a.Vadapav\nb.Poha\nc.Upama");
		System.out.println("Enter your choice");
		choice=sc.next().charAt(0);
		switch(choice) {
		case 'a':
		case 'A':
			System.out.println("Vadapav 20rs");
			break;
		case 'b':
		case 'B':
			System.out.println("Poha 30rs");
			break;
		case 'c':
		case 'C':
			System.out.println("Upama 30rs");
			default:
				System.out.println("This option is not available");
		}
	}
}
