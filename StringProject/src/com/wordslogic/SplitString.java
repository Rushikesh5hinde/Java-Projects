package com.wordslogic;

import java.util.Arrays;

public class SplitString {
	static void divideString(String s,int noOfc) {
		int len=s.length();
		int ns=len/noOfc;
		
		if(len%noOfc!=0) {
			System.out.println("Cannot divide into equal parts");
		}else {
			String splstr[]=new String[ns];
			int index=0;
			
			for(int i=0;i<s.length();i+=noOfc) {
				splstr[index]=s.substring(i,i+noOfc);
				index++;
			}
			System.out.println(Arrays.toString(splstr));
		}
	}
	static void divideStringAddHash(String s,int noOfc) {
		
			int len=s.length();
			if(len%noOfc!=0) {
				int x=noOfc-(len%noOfc);
				for(int i=0;i<x;i++) {
					s=s+"#";
				}
			}
			
			len=s.length();
			int ns=len/noOfc;
			
			String splstr[]=new String[ns];
			int index=0;
			
			for(int i=0;i<s.length();i+=noOfc) {
				splstr[index]=s.substring(i,i+noOfc);
				index++;
			}
			System.out.println(Arrays.toString(splstr));
		
	}
	public static void main(String[] args) {
		String[] st= {"I","am","very","smart"};
		String s=String.join("", st);
		System.out.println(Arrays.toString(st));
		
		int noOfChar=5;
//		divideString(s, noOfChar);
		divideStringAddHash(s, noOfChar);
	}
}
