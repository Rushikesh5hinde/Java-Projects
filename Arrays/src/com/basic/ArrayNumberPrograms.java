package com.basic;

import java.util.Arrays;

public class ArrayNumberPrograms {
	public static void evenNumber(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void oddNumber(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void printEvenOdd(int[] arr) {
		int[] evenArr=new int[arr.length];
		int evenindex=0;
		int[] oddArr=new int[arr.length];
		int oddindex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenArr[evenindex]=arr[i];
				evenindex++;
			}else {
				oddArr[oddindex]=arr[i];
				oddindex++;
				
			}
		}
		System.out.println(Arrays.toString(evenArr));
		System.out.println(Arrays.toString(oddArr));
	}
	public static boolean isPrime(int num) {
		int den=2;
		while(den<num) {
			if(num%den==0) {
				break;
			}
			den++;
		}
		if(num==den)
		{
			return true;
		}else {
			return false;
		}
	}
	public static boolean checkPrime(int num) {
		if(num<=1) {
			return false;
		}else {
//			boolean flag=true;
			int ct=0;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
//					flag=false;
					ct++;
					break;
				}
			}
//			return flag;
			if(ct==0) {
				return true;
			}else {
				return false;
			}
		}
	}
	
	public static boolean checkPalindrome(int num) {	//121
		int reverse=0;
		int temp=num;//121
		while(num!=0) {	//121!=0,12!=0,1!0,0!=0
			int rem=num%10;//rem=121%10=1,12%10=2,1%10=1
			reverse=reverse*10+rem;//rev=1,10+2=12,12*10+1=121
			num=num/10;//num=121/10=12,12/10=1,1/10=0
		}
		if(temp==reverse) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
//		evenNumber(arr);
//		oddNumber(arr);
//		printEvenOdd(arr);
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<arr.length;i++) {
			boolean ans=isPrime(arr[i]);
			
			if(ans==true) {
				System.out.print(arr[i]+" ");
			}
		}
//		int[] arr= {121,11,12,13,101};
//		for(int i=0;i<arr.length;i++) {
//			boolean ans=checkPalindrome(arr[i]);
//			if(ans==true) {
//				System.out.print(arr[i]+" ");
//			}
//		}
	}
}
