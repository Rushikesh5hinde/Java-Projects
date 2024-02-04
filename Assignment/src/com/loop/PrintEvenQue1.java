package com.loop;

public class PrintEvenQue1 {
	public static void main(String[] args) {
		int i;
		for(i=121;i<=229;i++) {
			if(even(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean even(int num) {
		return num%2==0;
	}
}
