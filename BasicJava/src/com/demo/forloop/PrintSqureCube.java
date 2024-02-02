package com.demo.forloop;

import java.util.Scanner;

public interface PrintSqureCube {
	public static void main(String[] args) {
		int i;
		System.out.println("num: square: cube");
		System.out.println("----------------------");
		for(i=1;i<=10;i++) {
			
			System.out.println(i+" : "+(i*i)+" : "+(i*i*i));
		}
	}
}
