package com.stringtask1202;

import java.util.Arrays;

// WAP to find the most repeated word in a string
public class MostRepeated {
	public static void mostRepeated(String s) {
		String[] st=s.split(" ");
		System.out.println(Arrays.toString(st));
		
		int ct;
		int[]maxct=new int[3];
		int maxindex=0;
		String[] max=new String[3];
		int index=0;
		boolean status;
		for(int i=0;i<st.length;i++) {
			ct=1;
			status=false;
			for(int k=i-1;k>=0;k--) {
				if(st[i].equals(st[k])) {
					status=true;
					break;
				}
			}
			if(status==false) {
				for(int j=i+1;j<st.length;j++) {
					if(st[i].equals(st[j])) {
						ct++;
					}
				}
				if(ct>1) {
					maxct[maxindex++]=ct;
					max[index++]=st[i];
				}
			}
		}
		for(int i=0;i<index;i++) {
			System.out.print(max[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		String s="reverse the first word by word keeping first and first word";
		mostRepeated(s);
	}
}
