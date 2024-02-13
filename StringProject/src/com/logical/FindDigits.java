package com.logical;

public class FindDigits {
	public static int findNoDigits(String s) {
		int dcount=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=48 && ch[i]<=57) {
				dcount++;
			}
		}
		return dcount;
	}
	public static int findCount(String s) {
		int ct=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i)))
			{
				ct++;
			}
		}
		return ct;
	}
	public static void main(String[] args) {
		String str="java1235";
		System.out.println(str);
		System.out.println("Count:"+findNoDigits(str));
		System.out.println("Count:"+findCount(str));
	}
}
