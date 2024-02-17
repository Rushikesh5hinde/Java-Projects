package com.stringtask1202;

import java.util.Arrays;

/*Create a function that takes in a sentence as input and returns true if there is
 at least one alphabetically sorted word inside that has a minimum length of 3.*/

public class SortedString {
	static boolean sortedString(String s) {
		String[] st=s.split("\\s");
		System.out.println(Arrays.toString(st));
		boolean flag=false;
		
		for(int i=0;i<st.length;i++) {
			flag=true;
				if(st[i].length()>3) {
					for(int j=0;j<st[i].length();j++) {
						for(int k=j+1;k<st[i].length();k++) {
							if(st[i].charAt(j)>st[i].charAt(k)) {
								flag=false;
								
								break;
							}
						}
					}
				}else {
					flag=false;
					
				}	
//				System.out.print(flag+" ");
				if(flag==true) {
					break;
				}
		}
		return flag;
		
	}
	public static void main(String[] args) {
//		String s="Paula has a French accent";
//		sortedString(s);
//		System.out.println();
//		System.out.println("------------------------------");
//		String s2="The biopsy returned negative results";
//		sortedString(s2);
//		System.out.println();
//		System.out.println("------------------------------");
//		String s3="She sells sea shells by the sea shore.";
//		sortedString(s3);
		
		String s="Paula has a French accent";
		System.out.println(sortedString(s));
		
		String s2="The biopsy returned negative results";
		System.out.println(sortedString(s2));
		
		String s3="She sells sea shells by the sea shore.";
		System.out.println(sortedString(s3));
		
		String s4="abcd aba";
		System.out.println(sortedString(s4));
	}
}
