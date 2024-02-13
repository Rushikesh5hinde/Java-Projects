package com.test5;

public class Array2D {
	public static void findMax(int[][] arr){
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]>max){
					max=arr[i][j];
				}
			}
		}
		System.out.println("Max:"+max);
	}
	public static void findAverage(int[][] arr){
		
		int sum,ct;
		for(int i=0;i<arr.length;i++){
			sum=0;ct=0;
			for(int j=0;j<arr[i].length;j++){
				
//				System.out.println("arr[][]="+arr[j][i]);
				sum=sum+arr[j][i];
				
//				System.out.println("Sum:"+sum);
				ct++;
//				System.out.println("Count:"+ct);
			}
//			System.out.println("Sum:"+sum);
//			System.out.println("Ct:"+ct);
//			System.out.println(sum/ct);
		}
	}
	public static void findAvg(int[][] arr) {
//		int[][] temp=new int[4][3];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				temp[j][i]=arr[i][j];
//			}
//		}
		int sum,ct;
		for(int j=0;j<=arr.length;j++) {
			sum=0;ct=0;
			for(int i=0;i<arr.length;i++) {
				sum=sum+arr[i][j];
				ct++;
			}
			System.out.println(sum/ct);
		}
	}
	public static void main(String[] args){
		int[][] arr={{2,4,9,7} , {6,5,3,10} ,{7,3,6,4}};
//		findMax(arr);
		System.out.println("-----------------------");
//		findAverage(arr);
		findAvg(arr);
	}
}
