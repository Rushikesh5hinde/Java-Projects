package com.array;

public class PrintVowels {
	public static boolean checkVowels(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' 
				|| ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		char[] ch= {'r','u','s','h','i','k','e'};
		
		for(int i=0;i<ch.length;i++) {
			if(checkVowels(ch[i]))
				System.out.print(ch[i]+" ");
		}
	}
}
