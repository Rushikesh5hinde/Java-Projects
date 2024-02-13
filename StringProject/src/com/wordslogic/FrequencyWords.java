package com.wordslogic;

public class FrequencyWords {
	static void findFrequency(String st) {
		String[] s=st.split("\\s");
		
		int ct;
		boolean status;
		
		for(int i=0;i<s.length;i++) {
			ct=1;
			status=false;
			for(int j=i-1;j>=0;j--) {
				   if(s[i].equalsIgnoreCase(s[j])) {
					   status=true;
					   break;
				   }
			}
			if(!status) {
				for(int k=i+1;k<s.length;k++) {
					if(s[i].equalsIgnoreCase(s[k])) {
						ct++;
					}
				}
				System.out.println(s[i]+"->"+ct);
			}
		}
	}
	public static void main(String[] args) {
		String st="A big cat is rolling on a big mat";
		System.out.println(st);
		findFrequency(st);
	}
}
