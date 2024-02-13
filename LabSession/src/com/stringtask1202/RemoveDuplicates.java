package com.stringtask1202;

import java.util.Arrays;

// WAP to remove all the duplicate words from a string
public class RemoveDuplicates {
	public static void removeDuplicates(String s) {
		String[] st=s.split(" ");
//		System.out.println(Arrays.toString(st));
		int ct;
		boolean status;
		for(int i=0;i<st.length;i++) {
			ct=1;
			status=false;
			for(int k=i-1;k>=0;k--) {
				status=true;
				break;
			}
			if(status==false ) {
				for(int j=i+1;j<st.length;j++) {
					if(st[i].equals(st[j])) {
						st[j]=null;
					}
				}
				
			}
		}
		System.out.println(Arrays.toString(st));
	}
	public static void removeDuplicate(String s) {
		String[] st=s.split(" ");
//		System.out.println(Arrays.toString(st));
		
		for(int i=0;i<st.length;i++) {			
				if(st[i]!=null) {
					for(int j=i+1;j<st.length;j++) {
						if(st[i].equals(st[j])) {
							st[j]=null;
						}
					}
				}
				
		}
		String str="";
		for(int i=0;i<st.length;i++) {
			if(st[i]!=null) {
				str=str+st[i]+" ";
			}
		}
		System.out.println(str);
//		System.out.println(Arrays.toString(st));
	}
	public static void main(String[] args) {
		String s="a big cat is rolling on a big mat";
		System.out.println(s);
		removeDuplicate(s);
	}
}
