package com.test6;

import java.util.Arrays;

public class RemoveSpaces {
	static void removeSpaces(String s){
		
		String str="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' ') 
			{
				str=str+s.charAt(i);
			}else if(s.charAt(i)==' ') 
			{
				if(s.charAt(i+1)==' ')
					continue;
				else {
					str=str+" ";
				}
			}
		}
		System.out.println(str);
	}
	static void removeSpace(String s){
		
		String str="";
		String str1="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' ') 
			{
				str=str+s.charAt(i);
			}else {
				if(str!="")
				{
					str1=str1+str+" ";
					str="";
				}
			}
		}
		System.out.println(str1+str);
//		System.out.println(str);
	}
	
	public static void main(String[] args){
		String s="  I  am   learning     java";
		removeSpaces(s);
	}
}
