package com.logical;

import java.util.Arrays;

public class ReplaceChar {
	public static String repalceChar(String s) {
		
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ' || ch[i]=='.')
				continue;
			if(ch[i]=='A' | ch[i]=='E' | ch[i]=='I'| ch[i]=='O'| ch[i]=='U') {
				ch[i]='$';
			}else if(ch[i]=='a' | ch[i]=='e' | ch[i]=='i'| ch[i]=='o'| ch[i]=='u'){
				ch[i]='$';
			}
		}
		String str=new String(ch);
		return str;
	}
	public static void main(String[] args) {
		String str="javA";
		System.out.println(repalceChar(str));
	}
}
