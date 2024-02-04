package com.test2;

import java.util.Scanner;

public class CheckCharacter {
	public static void checkChar(char ch){
		switch(ch){
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
			System.out.println("It is vowel");
			break;
		default:
			System.out.println("It is consonant");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter character");
		ch=sc.next().charAt(0);
		checkChar(ch);
	}

}
