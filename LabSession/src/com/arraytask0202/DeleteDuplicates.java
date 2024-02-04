package com.arraytask0202;

import java.util.Arrays;

// Delete all the duplicate elements from an char array
public class DeleteDuplicates {
	public static void deleteDuplicates(char[] ch) {
		
		for(int i=0;i<ch.length;i++) {
			
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]='\u0000';
				}
			}
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='\u0000') {
				System.out.print(ch[i]+" ");
			}
		}
		
	}
	public static void main(String[] args) {
		char ch[]= {'a','b','c','a','b'};
		deleteDuplicates(ch);
	}
}
