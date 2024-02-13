package com.stringtask1202;

import java.util.Arrays;

public class FindDuplicateUnique {
	static void findDuplicate(String s) {
		String st[]=s.split("\\s");
//		System.out.println(Arrays.toString(st));
		int ct;
		boolean status;
		for(int i=0;i<st.length;i++) {
			ct=1;
			status=false;
			for(int k=i-1;k>=0;k--) {
				if(st[k].equalsIgnoreCase(st[i])) {
					status=true;
					break;
				}
			}
			if(!status) {
				for(int j=i+1;j<st.length;j++) {
					if(st[j].equalsIgnoreCase(st[i])) {
						ct++;
					}
				}
				if(ct>1) {
					System.out.println(st[i]+"->"+ct);
				}
			}
		}
	}
	static void findUnique(String s) {
		String st[]=s.split("\\s");
//		System.out.println(Arrays.toString(st));
		int ct;
		boolean status;
		for(int i=0;i<st.length;i++) {
			ct=1;
			status=false;
			for(int k=i-1;k>=0;k--) {
				if(st[k].equalsIgnoreCase(st[i])) {
					status=true;
					break;
				}
			}
			if(!status) {
				for(int j=i+1;j<st.length;j++) {
					if(st[j].equalsIgnoreCase(st[i])) {
						ct++;
					}
				}
				if(ct==1) {
					System.out.println(st[i]+"->"+ct);
				}
			}
		}
	}
	public static void main(String[] args) {
		String s="a big cat is rolling on a big mat";
		findDuplicate(s);
		System.out.println("-----------------");
		findUnique(s);
	}
}
