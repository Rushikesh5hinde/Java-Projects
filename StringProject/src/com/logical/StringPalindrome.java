package com.logical;

public class StringPalindrome {
	static boolean checkPalindrome(String s) {
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		if(s1.equalsIgnoreCase(s)) {
			return true;
		}else {
			return false;
		}
	}
	static boolean checkPalindrome2(String s) {
		s=s.toLowerCase();
		
		for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s="level";
		if(checkPalindrome2(s)) {
			System.out.println(s+" is palindrome");
		}else {
			System.out.println(s+" is not palindrome");
		}
	}
}
