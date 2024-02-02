package com.intermediate;

public class Frequency {
	public static void findFrequency(int[] arr) {
		int count;
		boolean flag;
		for(int i=0;i<arr.length;i++) {
			count=1;
			flag=false;
			//check element if element is new
			for(int j=i-1;j>=0;j--) {
				if(arr[j]==arr[i]) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j])
					{
						count++;
					}
				}
				System.out.println(arr[i]+"-->"+count);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,1,2,3,4,5,5,6,7,3,4};
		findFrequency(arr);
	}
}
