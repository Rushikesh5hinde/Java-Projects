package com.stringtask1202;

import java.util.Arrays;

public class ReverseString1 {
	static String reverseString(String s) {
		String str="";
		for(int i=s.length()-1;i>=0;i--) {
			str=str+s.charAt(i);
		}
		return str;
	}
	static void printReverse(String s) {
		
		String[] st=s.split(" ");
		String str="";
		System.out.println(Arrays.toString(st));
		for(int i=st.length-1;i>=0;i--) {
			str=str+reverseString(st[i])+" ";
			
		}
		System.out.print(str);
	}
	public static void main(String[] args) {
		String s="1 23 456";//REWOL reppu
		printReverse(s);
	}
}
