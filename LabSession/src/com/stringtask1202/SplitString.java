package com.stringtask1202;

import java.util.Arrays;

//WAP to split string into 2 tokens where string is “HELLO$WORLD
public class SplitString {
	static void splitString(String s) {
		String[] st=s.split("\\$");
		System.out.println(Arrays.toString(st));
		String str="";
		for(int i=0;i<st.length;i++) {
			str=str+st[i]+" ";
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		String s="HELLO$WORLD";
		splitString(s);
	}
}
