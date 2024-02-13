package com.wordslogic;

public class ReverseString {
	static void findReverse(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	static void findReverseWordByWord(String str) {
		String[] s=str.split(" ");
		String rev="";
		for(int i=0;i<s.length;i++) {
			for(int j=s[i].length()-1;j>=0;j--) {
				rev=rev+s[i].charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		String str="I like to learn Java";
		System.out.println(str);
		findReverse(str);
		System.out.println("-------------------------------------------");
		findReverseWordByWord(str);
	}
}
