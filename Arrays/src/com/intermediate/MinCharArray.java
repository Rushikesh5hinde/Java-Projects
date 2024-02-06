package com.intermediate;

import java.util.Arrays;

public class MinCharArray {
	public static char findMinChar(char[] ch) {
		char min=ch[0];
		for(int i=0;i<ch.length;i++) {
			if(ch[i]<min) {
				min=ch[i];
			}
		}
		return min;
	}
	public static void swapMaxMin(char[] ch) {
		char min=ch[0];
		char max=ch[0];
		int maxpos=0,minpos=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]<min) {
				min=ch[i];
				minpos=i;
			}
			if(ch[i]>max) {
				max=ch[i];
				maxpos=i;
			}
		}
		char temp=ch[maxpos];
		ch[maxpos]=ch[minpos];
		ch[minpos]=temp;
		
		System.out.println(Arrays.toString(ch));
	}
	public static void main(String[] args) {
		char[] ch= {'z','x','b','y'};
		System.out.println("Minimum:"+findMinChar(ch));
		
		swapMaxMin(ch);
	}
}
