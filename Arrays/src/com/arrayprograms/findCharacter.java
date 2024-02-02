package com.arrayprograms;

public class findCharacter {
	public static void findMaxChar(char[] ch) {
		char max=ch[0],min=ch[0];
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>max) {
				max=ch[i];
			}
			if(ch[i]<min) {
				min=ch[i];
			}
		}
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
	} 
	public static void main(String[] args) {
		char[] ch= {'a','e','i','o','u'};
		findMaxChar(ch);
	}
}
