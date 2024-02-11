package com.assignment1;
//12,5,2
public class Que4 {
	public static void main(String[] args) {
		int[][] arr={{12, 31, 9}, {12,5,16}, {34, 42, 2}} ;
		
		int min;
		for(int i=0;i<arr.length;i++) {
			min=Integer.MAX_VALUE;
			for(int j=0,k=i;j<arr.length && k<arr.length;j++) {
				if(min>arr[j][k]) {
					min=arr[j][k];
				}
			}
			System.out.println(min);
		}
		
	}
}
