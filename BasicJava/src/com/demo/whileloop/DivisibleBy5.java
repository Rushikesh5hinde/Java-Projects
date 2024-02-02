package com.demo.whileloop;

public class DivisibleBy5 {
	public static void main(String[] args) {
		int i=1;
		while(i<=50) {
			if(i%5==0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
