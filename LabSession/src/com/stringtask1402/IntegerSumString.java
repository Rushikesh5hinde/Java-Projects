package com.stringtask1402;

public class IntegerSumString {
	static void findSum(String s) {
		int sum=0;
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				int x=Character.getNumericValue(ch[i]);
				sum=sum+x;
			}
		}
		System.out.println("Sum is:"+sum);
	}
	static void printSum(String s) {
		int sum=0;
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=48 && ch[i]<=57) {
				int x=ch[i]-48;
				sum=sum+x;
			}
		}
		System.out.println("Sum is:"+sum);
	}
	static void printAverage(String s) {
		int sum=0,ct=0;
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=48 && ch[i]<=57) {
				int x=ch[i]-48;
				sum=sum+x;
				ct++;
			}
		}
		System.out.println("Average is:"+(sum/ct));
	}
	public static void main(String[] args) {
		String s="Sachin scores 567 runs in test match";
//		findSum(s);
//		printSum(s);
		printAverage(s);
	}
}
