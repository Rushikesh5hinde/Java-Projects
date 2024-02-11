package com.arraytask0902;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
	public static void firstOccurnce(String s,char ch) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				System.out.println(ch+" at index:"+i);
				break;
			}
			
		}
	}
	public static void middleOccurance(String s,char ch) {
		int ct=0,i;
		for( i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				
				ct++;
				if(ct==2) {
					System.out.println(ch+" at index:"+i);
					break;
				}
			}
			
		}
		
	}
	public static void charOccurance(String s) {
		int ct;
		boolean flag;
		for(int i=0;i<s.length();i++) {
			ct=1;
			flag=false;
			for(int k=i-1;k>=0;k--) {
				if(s.charAt(i)==s.charAt(k)) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				for(int j=i+1;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						ct++;
					}
				}
				System.out.println(s.charAt(i)+":"+ct);
			}
		}
		
	}
	public static void findDuplicate(String s) {
		int ct;
		boolean flag;
		for(int i=0;i<s.length();i++) {
			ct=1;
			flag=false;
			for(int k=i-1;k>=0;k--) {
				if(s.charAt(i)==s.charAt(k)) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				for(int j=i+1;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						ct++;
					}
				}
				if(ct>1) {
					System.out.println(s.charAt(i)+":"+ct);
				}
			}
		}
		
	}
	public static String removeSpaces(String s) {
		String str="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				str+=s.charAt(i);
			}
		}
		return str;
	}
	
	public static void toggleCases2(String s) {
		System.out.println(s);
		char[] ch=s.toCharArray();
		String str="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
				str+=ch[i];
			}
			else if(ch[i]>='a' && ch[i]<='z'){
				ch[i]=(char)(ch[i]-32);
				str+=ch[i];
			}else {
				str+=ch[i];
			}
		}
		  System.out.println(str);      
	}
	public static String reverseString(String s) {
		String str="";
		for(int i=s.length()-1;i>=0;i--) {
			str+=s.charAt(i);
		}
		return str;
	}
	public static void highestFrequencyChar(String s) {
		char[] ch=s.toCharArray();
		int ct,maxct=Integer.MIN_VALUE;
		char maxchar='\u0000';
		boolean flag;
		
		for(int i=0;i<s.length();i++) {
			ct=1;
			flag=false;
			for(int k=i-1;k>=0;k--) {
				if(s.charAt(i)==s.charAt(k)) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				for(int j=i+1;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						ct++;
					}
				}
				if(ct>maxct) {
					maxct=ct;
					maxchar=s.charAt(i);
				}
			}
		}
		System.out.println(maxchar+":"+maxct);
	}
//	Write a Java program to remove duplicate  character in given string.
	public static void removeDuplicate(String s) {
		char[] ch=s.toCharArray();//java
		String str="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='\u0000') {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						
						ch[j]='\u0000';
					}else {
						continue;
					}
				}
				str=str+ch[i];
			}
		}
		System.out.println(str);
		
	}
//	Take two string arrays and find the common elements between them
	public static void findCommonElements(String s1,String s2) {
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					System.out.println(s1.charAt(i));
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter String");
//		String s=sc.next();
//		firstOccurnce(s,'a');
//		System.out.println(s.lastIndexOf('s'));
//		middleOccurance(s, 's');
		
//		charOccurance(s);
//		findDuplicate(s);
		
//		System.out.println(removeSpaces("  j ava  "));
		
//		toggleCases2("jAva123");
//		System.out.println(reverseString("loop"));
		
//		highestFrequencyChar("abbcd");
//		removeDuplicate("middle");
//		String s1="a";
//		String s2="a";
//		System.out.println(s2.compareTo(s1));
		findCommonElements("race", "face");
	}
}
