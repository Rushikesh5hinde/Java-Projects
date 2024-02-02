package com.demo.whileloop;

public class PrintCharacters {
	public static void main(String[] args) {
		char ch='A';
		while(ch<='Z') {
			System.out.println(ch++);
		}
		System.out.println("------------------");
		int i=97;
		while(i<=122) {
			System.out.println((char)(i++));
		}
	}
}
