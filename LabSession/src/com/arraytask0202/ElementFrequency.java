package com.arraytask0202;

public class ElementFrequency {
	public static void findFrequency(char[] ch) {
		int count;
		boolean flag;
		for(int i=0;i<ch.length;i++) {
			count=1;
			flag=false;
			for(int j=i-1;j>=0;j--) {
				if(ch[i]==ch[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false) {
				for(int k=i+1;k<ch.length;k++) {
					if(ch[i]==ch[k]) {
						count++;
					}
				}
				System.out.println(ch[i]+":"+count);
			}
			
		}
	}
	public static void main(String[] args) {
		char[] ch= {'a','b','a','b','c','d','e','e','e'};
		findFrequency(ch);
	}
}
