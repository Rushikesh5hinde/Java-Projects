package com.loop;

public class PrintEvenQue3 {
	public static void main(String[] args) {
		int i=121;
		do {
			if(even(i)) {
				System.out.println(i);
			}
			i++;
		}while(i<=229);
	}
	public static boolean even(int num) {
		return num%2==0;
	}
}
