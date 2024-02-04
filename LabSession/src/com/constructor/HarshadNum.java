package com.constructor;

import java.util.Scanner;

public class HarshadNum {
	int num;
	
	public HarshadNum() {
		
	}
	public HarshadNum(int num) {
		this.num = num;
	}
	
	public boolean isHarshad() {
		int temp=num,sum=0;
		while(temp!=0) {
			sum=sum+(temp%10);
			temp/=10;
		}
		return (temp%sum==0);
	}
	
}
