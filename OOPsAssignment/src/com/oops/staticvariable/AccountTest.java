package com.oops.staticvariable;

import java.util.Scanner;

public class AccountTest {
	static Scanner sc=new Scanner(System.in);
	
	public static void insert(Account a) {
		System.out.println("Enter Account no:");
		a.setAcc_no(sc.nextInt());
		System.out.println("Enter Account Holder name:");
		a.setName(sc.next());
		System.out.println("Enter amount:");
		a.setAmount(sc.nextFloat());
	}
	public static void showAccount(Account a1) {
		char ch;
		do {
			System.out.println("1.deposit\n2.withdraw\n3.check Balance");
			System.out.println("Enter choice:");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter amount to deposit:");
				String str=a1.depositAmount(sc.nextDouble());
				System.out.println(str);
				break;
			case 2:
				System.out.println("Enter amount to withdraw:");
				String str2=a1.withdrawAmount(sc.nextDouble());
				System.out.println(str2);
				break;
			case 3:
				double amount=a1.getAmount();
				System.out.println("Your balance is:"+amount);
				break;
				default:
					System.out.println("please provide correct input");
			}
			System.out.println("do you want to continue?Yes-y No-n");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
	public static void main(String[] args) {
		Account a1=new Account();
		
		insert(a1);
		System.out.println("Account created:"+Account.count);
		System.out.println(a1);
		
		showAccount(a1);
		
		Account a2=new Account();
		insert(a2);
		System.out.println("Account created:"+Account.count);
		System.out.println(a2);
		
		
//		
		showAccount(a2);
		
		
		
	}
}
