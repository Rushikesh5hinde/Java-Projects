package com.stringtask1202;

import java.util.Arrays;

public class StringDemo {
	public static void arrangeString(String[] st) {
		for(int i=0;i<st.length;i++) {
			for(int j=i+1;j<st.length;j++) {
				if(st[i].length()!=st[j].length()) {
					if(st[i].length()>st[j].length()) {
						String temp=st[i];
						st[i]=st[j];
						st[j]=temp;
					}
				}else {
					if(st[i].compareTo(st[j])>=0) {
						String temp=st[i];
						st[i]=st[j];
						st[j]=temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(st));
	}
	public static void main(String[] args) {
		String[] st= {"Python","C","Angular","Spring","React","C#","SpringBoot"};
		System.out.println(Arrays.toString(st));
		System.out.println("---------------------------------");
		arrangeString(st);
	}
}
