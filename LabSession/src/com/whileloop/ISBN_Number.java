package com.whileloop;

public class ISBN_Number {
	public static void main(String[] args) {
		System.out.println(checkISBN(1259060977));
	}
	public static boolean checkISBN(long num) {
		int ct=digitCount(num);
		if(ct!=10) {
			return false;
		}else {
			int i,sum=0,rem;
			for(i=1;i<=10;i++) {
				rem=(int) (num%10);
//				System.out.println("rem:"+rem);
				sum=sum+(rem*i);
//				System.out.println("sum:"+sum);
				num/=10;
			}
//			System.out.println("Finalsum:"+sum);
			return sum%11==0;
		}
	}
	public static int digitCount(long num) {
		int ct=0;
		while(num!=0) {
			ct++;
			num/=10;
		}
		return ct;
	}
}
