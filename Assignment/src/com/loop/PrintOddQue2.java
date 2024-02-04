package com.loop;

public class PrintOddQue2 {
	public static void main(String[] args) {
		int i=521;
		while(i>=229) {
			if(odd(i)) {
				System.out.println(i);
			}
			i--;
		}
	}
	public static boolean odd(int num) {
		return num%2==1;
	}
}
