package com.arraytask0202;

import java.util.Arrays;

//Shift all the even number at the end of array using temporary array
public class EvenNumberEnd {
	public static void shiftEvenEnd(int[] arr) {
		int evenct=0,oddct=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenct++;
			}else {
				oddct++;
			}
		}
		System.out.println(evenct);
		System.out.println(oddct);
		int[] even=new int[evenct];
		int i2=0,i3=0;
		int[] odd=new int[oddct];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even[i2++]=arr[i];
			}else {
				odd[i3++]=arr[i];
			}
		}
//		System.out.println(Arrays.toString(even));
//		System.out.println(Arrays.toString(odd));
		
		//print even at end
//		int[] res=new int[even.length+odd.length];
//		int index=0;
//		
//		for(int i=0;i<odd.length;i++) {
//			res[index++]=odd[i];
//		}
//		for(int i=0;i<even.length;i++) {
//			res[index++]=even[i];
//		}
		
		//print even at start
		
		int[] res=new int[even.length+odd.length];
		int index=0;
		for(int i=0;i<even.length;i++) {
			res[index++]=even[i];
		}
		for(int i=0;i<odd.length;i++) {
			res[index++]=odd[i];
		}
		
		//print alternate
		
//		int big=even.length>odd.length?even.length:odd.length;
//		for(int i=0;i<big;i++) {
//			if(i<even.length) {
//				res[index++]=even[i];
//			}
//			if(i<odd.length){
//				res[index++]=odd[i];
//			}
//		}
		
		System.out.println(Arrays.toString(res));
	}
	public static void shiftEvenEnd2(int[] arr) {
		int ct=arr.length-1;
		int[] temp=new int[arr.length];
		int index=0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]%2==0) {
				temp[index++]=arr[i];
			}else {
				arr[ct]=arr[ct-1];
				ct--;
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(temp));
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
//		shiftEvenEnd(arr);
		shiftEvenEnd2(arr);
	}
}
