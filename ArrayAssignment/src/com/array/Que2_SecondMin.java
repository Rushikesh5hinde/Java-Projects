package com.array;

public class Que2_SecondMin {
	public static void secondMin(int[] arr) {
		int secondMin=Integer.MAX_VALUE-1;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secondMin=min;
				min=arr[i];
			}else if(arr[i]<min && secondMin!=min)
			{
				secondMin=min;
			}
			
		}
		System.out.println("Min:"+min);
		System.out.println("Second Min:"+secondMin);
	}
	public static void main(String[] args) {
		int[] arr= {-20,0,-25,15,19,37,23};
		secondMin(arr);
	}
}
