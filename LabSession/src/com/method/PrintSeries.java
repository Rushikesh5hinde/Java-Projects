package com.method;

public class PrintSeries {
	public static void printSeries()
	{
		int i,num=0,num2=2;
		for(i=0;i<=10;i++) {
			num=num+num+1;
			System.out.print(num+" ");
			System.out.print(num2+" ");
			num2=num2+num2-1;
		}
	}
	public static void main(String[] args) {
		printSeries();
	}
}
