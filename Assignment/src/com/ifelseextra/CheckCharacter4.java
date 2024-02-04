package com.ifelseextra;

import java.util.Scanner;

public class CheckCharacter4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter character");
		ch=sc.next().charAt(0);
		int res=(int) ch;
		if(res>=65 && res<=90 || res>=97 && res<=122)
		{
			System.out.println(ch+" is an alphabet");
		}else if(res>=48 && res<=57)
		{
			System.out.println(ch+" is a number");
		}else{
			System.out.println(ch+" is a special character");
		}
	}
}
