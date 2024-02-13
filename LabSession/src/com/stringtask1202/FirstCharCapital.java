package com.stringtask1202;

import java.util.Arrays;

//WAP to make the first character of every word in a string as capital
public class FirstCharCapital {
	public static void firstCapital(String s) {
		String[] st=s.split(" ");
		System.out.println(Arrays.toString(st));
		for(int i=0;i<st.length;i++) {
			String str="";
			if(st[i].charAt(0)>='a' && st[i].charAt(0)<='z') {
				str=str+(char)(st[i].charAt(0)-32);
			}
			
			for(int j=1;j<st[i].length();j++) {
				
				str=str+st[i].charAt(j);
			}
			st[i]=str;
		}
		System.out.println(Arrays.toString(st));
	}
	public static void main(String[] args) {
		String s="a big cat is rolling on a big mat";
		firstCapital(s);
	}
}
