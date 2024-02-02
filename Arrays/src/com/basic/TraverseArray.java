package com.basic;

public class TraverseArray {
	public static void main(String[] args) {
		int []arr=new int[5];
		arr[0]=90;
		arr[1]=80;
		arr[2]=70;
		arr[3]=60;
		arr[4]=50;
//		arr[5]=90;	array index out of bound exception
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println("-----------------------------");
		//array as literal
		
		int arr1[]= {10,20,30};
		
//		int piyush[]=new int[] {10,20,30,40};
		int[] piyush= {10,20,30,40};
		
		for(int i=0;i<piyush.length;i++) {
			System.out.print(piyush[i]+" ");
		}
	}
}
