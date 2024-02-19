package com.test6;

public class Anagram {
	static void sortArray(char[] ch){
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
			if(ch[i]>ch[j]){
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				}
			}
		}
	}
	static boolean isAnagram(String s1,String s2){
		if(s1.length()!=s2.length()){
			return false;
		}else{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();

			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();

			sortArray(ch1);
			sortArray(ch2);

			for(int i=0;i<ch1.length;i++){
				if(ch1[i]!=ch2[i])
				return false;
			}
			return true;
		}
	}
	public static void main(String[] args){
		String s1="saw";
		String s2="was";

		if(isAnagram(s1,s2)){
			System.out.println("Anagram");
		}else{
			System.out.println("not an Anagram");
		}
	}
}
