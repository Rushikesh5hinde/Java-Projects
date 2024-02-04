package com.arraytask0202;

public class UniqueElements {
	public static void findUnique(char[] ch) {
		int count;
		boolean flag;
		for(int i=0;i<ch.length;i++) {
			count=1;
			flag=false;
			for(int k=i-1;k>=0;k--) {
				if(ch[i]==ch[k]) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++;
					}
				}
				if(count==1) {
					System.out.println(ch[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		char ch[]= {'a','b','c','a','b'};
		findUnique(ch);
	}
}
