package com.switchcase;

import java.util.Scanner;

public class BankBalance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double balance=10000,amount;
		int choice;
		System.out.println("1.Deposit\n2.Withdraw\n3.View Balance");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter amount you want to deposit");
			amount=sc.nextDouble();
			balance=balance+amount;
			System.out.println("Total Balance:"+balance);
			break;
		case 2:
			System.out.println("Enter amount you want to withdraw");
			amount=sc.nextDouble();
			balance=balance-amount;
			System.out.println("Total Balance:"+balance);
			break;
		case 3:
			System.out.println("Balance:"+balance);
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
