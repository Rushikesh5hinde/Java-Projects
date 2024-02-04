package com.switchcase;

import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("1.Jan\n2.Feb\n3.Mar\n4.Apr\n5.May\n6.Jun\n7.Jul\n8.Aug\n9.Sept\n10.Oct"
				+ "\n11.Nov\n12.Dec");
		System.out.println("Enter choice");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("31 days in January!");
			break;
		case 2:
			System.out.println("28 or 29 days in Feb!");
			break;
		case 3:
			System.out.println("31 days in March!");
			break;
		case 4:
			System.out.println("30 days in April!");
			break;
		case 5:
			System.out.println("31 days in May!");
			break;
		case 6:
			System.out.println("30 days in June!");
			break;
		case 7:
			System.out.println("31 days in July!");
			break;
		case 8:
			System.out.println("31 days in August!");
			break;
		case 9:
			System.out.println("30 days in Sept!");
			break;
		case 10:
			System.out.println("31 days in October!");
			break;
		case 11:
			System.out.println("30 days in Nov!");
			break;
		case 12:
			System.out.println("31 days in December!");
			break;

		default:
			System.out.println("Invalid Input");
			break;
		}
	}
}
