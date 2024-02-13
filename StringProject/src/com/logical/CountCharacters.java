package com.logical;

public class CountCharacters {
	public static int findNoChars(String str) {
		int count=0;
		char[] ch=str.toCharArray();
		for(char c:ch) {
			count++;
		}
		return count;
	}
	public static void findVowelConsonants(String s) {
		int vcount=0,ccount=0;
		s=s.toUpperCase();
		char[] ch=s.toCharArray();
		for(char c:ch) {
			if(c==' ' || c=='.')
				continue;
			if(c=='A' | c=='E' | c=='I'| c=='O'| c=='U') {
				vcount++;
			}else {
				ccount++;
			}
		}
		System.out.println("Number of vowels:"+vcount);
		System.out.println("Number of consonants:"+ccount);
	}
	public static void main(String[] args) {
		String str="Programming is fun.";
		System.out.println("No of characters:"+findNoChars(str));
		System.out.println(str);
		findVowelConsonants(str);
	}
}
