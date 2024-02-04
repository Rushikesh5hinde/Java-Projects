package com.ifelseextra;

import java.util.Scanner;

public class CheckAmountNotes8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int amount;//2510
		
		System.out.println("Enter amount");
		amount=sc.nextInt();
		checkNotes(amount);
	}
	public static void checkNotes(int amount) {
		int n2000=0,n500=0,n200=0,n100=0,n50=0,n20=0,n10=0;
		if(amount>=2000) {
			n2000=amount/2000;
			amount=amount-n2000*2000;//2500-2000=500
		}
		if(amount>=500) {
			n500=amount/500;
			amount=amount-n500*500;
		}if(amount>=200) {
			n200=amount/200;
			amount=amount-n200*200;
		}
		if(amount>=100) {
			n100=amount/100;
			amount=amount-n100*100;
		}if(amount>=50) {
			n50=amount/50;
			amount=amount-n50*50;
		}if(amount>=20) {
			n20=amount/20;
			amount=amount-n20*20;
		}if(amount>=10) {
			n10=amount/10;
			amount=amount-n10*10;
		}
		
		System.out.println("Notes of 2000:"+n2000);
		System.out.println("Notes of 500:"+n500);
		System.out.println("Notes of 200:"+n200);
		System.out.println("Notes of 100:"+n100);
		System.out.println("Notes of 50:"+n50);
		System.out.println("Notes of 20:"+n20);
		System.out.println("Notes of 10:"+n10);
	}
}
