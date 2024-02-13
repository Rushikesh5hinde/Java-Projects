package com.stringtask1202;

import java.util.Arrays;

//WAP to reverse the string word by word keeping first and last as it is 
public class ReverseString {
	static void printReverse(String s) {
		String[] st=s.split(" ");
		System.out.println(Arrays.toString(st));
		int j=st.length-2;//5
		for(int i=1;i<st.length-1;i++) {
			if(i<j) {
				String temp=st[i];
				st[i]=st[j];
				st[j]=temp;
			}
			j--;
		}
		System.out.println(Arrays.toString(st));
	}
	static void printReverse2(String s) {
		String[] st=s.split(" ");
		System.out.println(Arrays.toString(st));
		String str;
		for(int i=1;i<st.length-1;i++) {
			str="";
			for(int j=st[i].length()-1;j>=0;j--) {
				str=str+st[i].charAt(j);
			}
			st[i]=str;
		}
		
		System.out.println(Arrays.toString(st));
	}
	public static void main(String[] args) {
		String s="Java is a simple and robust language";
		System.out.println(s);
		
		printReverse2(s);
	}
}
