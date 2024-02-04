package com.test2;

public class Do_While_Use {
	public static void main(String[] args) {
		printNum();
	}
	public static void printNum(){
		int i=1;
		do{
			System.out.println(i++);
		}while(i<5);
	}
}
