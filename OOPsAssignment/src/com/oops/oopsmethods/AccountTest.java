package com.oops.oopsmethods;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int acno,amount,deposit,withdrw,choice;
		String name;
		Account a1=new Account();
		System.out.println("Enter account no");
		acno=sc.nextInt();
		System.out.println("Enter account holder name");
		name=sc.next();
		System.out.println("Enter amount");
		amount=sc.nextInt();
		a1.insert(acno, name, amount);
		char ch;
		do {
			System.out.println("1.deposit\n2.withdraw\n3.check Balance");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter amount you want to deposit");
				deposit=sc.nextInt();
				a1.deposit(deposit);
				break;
			case 2:
				System.out.println("Enter amount you want to withdraw");
				withdrw=sc.nextInt();
				a1.withdraw(withdrw);
				break;
			case 3:
				a1.checkBalance();
				break;
				default:
					System.out.println("Invalid Input");
			}
			System.out.println("do you want to continue press y or to stop press n");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
}
