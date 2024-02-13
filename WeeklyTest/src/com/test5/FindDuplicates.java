package com.test5;

public class FindDuplicates {
	public static void findDuplicates(int[] arr){

		int ct;
		boolean status;

		for(int i=0;i<arr.length;i++){
			ct=1;
			status=false;
			for(int k=i-1;k>=0;k--){
				if(arr[i]==arr[k]){
					status=true;
					break;
				}
			}
			if(status==false){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]==arr[j]){
						ct++;
					}
				}
				if(ct>1){
					System.out.println(arr[i]+" : "+ct);
				}
			}
		}
	}
	public static void main(String[] args){
		int[] arr={1,2,3,3,4,5,6,1};
		findDuplicates(arr);
	}
}
