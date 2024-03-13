package com.test8;

public class CheckString {
	public static void main(String[] args){
		String s="COMIC";
		if(checkPalindrome(s)){
			System.out.println("Palindrome");
		}else if(checkSpecial(s)){
			System.out.println("Only Special!");
		}else{
			System.out.println("Neither Palindrome Nor Special!");
		}
	}
	public static boolean checkPalindrome(String s){
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)){
			return true;
		}else
			return false;
	}
	public static boolean checkSpecial(String s){
		if(s.charAt(0)==s.charAt(s.length()-1)){
			return true;
		}else{
			return false;
		}
	}
}
