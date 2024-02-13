package com.stringtask1202;

public class Pattern {
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+2;j++) {
				for(int k=0;k<=j;k++) {
					System.out.print("*"+" ");
				}
				System.out.println();
			}
		}
	}
}
