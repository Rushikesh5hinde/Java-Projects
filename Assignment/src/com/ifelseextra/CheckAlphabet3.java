package com.ifelseextra;

import java.util.Scanner;

public class CheckAlphabet3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter Character");
		ch=sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println(ch+" is vowel!");
		}else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println(ch+" is vowel!");
		}else{
			System.out.println(ch+" is consonent!");
		}
	}
}
