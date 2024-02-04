package com.method_ifelse;

import java.util.Scanner;

public class CheckUpperLower5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter character");
		ch=sc.next().charAt(0);
		checkCase(ch);
	}
	public static void checkCase(char ch) {
		if(ch>='A' && ch<='Z') {
			System.out.println(ch+" is Uppercase");
		}else if(ch>='a' && ch<='z') {
			System.out.println(ch+" is Lowercase");
		}else {
			System.out.println("Invalid Input");
		}
	}
}
