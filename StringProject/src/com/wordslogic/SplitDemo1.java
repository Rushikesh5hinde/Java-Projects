package com.wordslogic;

import java.util.Arrays;

public class SplitDemo1 {
	public static void main(String[] args) {
		String str="I like to learn java";
		
		String[] s=str.split("\\s");//str.split(" ");
		System.out.println(Arrays.toString(s));
	}
}
