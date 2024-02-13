package com.logical;

import java.util.Arrays;

public class SortArrayLogic {
	static void sortLength(String[] s) {
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].length()>s[j].length()) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		
	}
	static void sortLexo(String s[]) {
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].compareTo(s[j])>0) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		String[] s= {"java","c","angular","python"};
		System.out.println(Arrays.toString(s));
		sortLength(s);
		System.out.println(Arrays.toString(s));
		sortLexo(s);
		System.out.println(Arrays.toString(s));
	}
}
