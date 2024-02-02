package com.demo.method;

public class Method_Loop_Demo1 {
	static int i;
	static int sum=0;
	public static void calSum(int n) {
		for(i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum:"+sum);
	}
	public static int calSum1(int n) {
		for(i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		int num=10;
//		calSum(num);
		int sum=calSum1(num);
		System.out.println(sum);
	}
}
