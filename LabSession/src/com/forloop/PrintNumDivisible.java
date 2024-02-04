package com.forloop;

public class PrintNumDivisible {
	public static void main(String[] args) {
		int i;
		for(i=1;i<=50;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i+" Welcome");
			}else if(i%3==0) {
				System.out.println(i+ " Hello");
			}else if(i%5==0) {
				System.out.println(i+" Bye");
			}else {
				System.out.println(i);
			}
		}
	}
}
