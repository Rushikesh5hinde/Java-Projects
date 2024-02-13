package com.enummovie;

import java.util.Scanner;

public class Booking {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ticket type:");
		System.out.println("1.Standard: "+MovieSeat.STANDARD.price);
		System.out.println("2.Premium: "+MovieSeat.PREMIUM.price);
		System.out.println("3.Recliner: "+MovieSeat.RECLINER.price);
		
		int seatType=sc.nextInt();
		
		MovieSeat ms=null;
		
		System.out.println("Enter no of seats:");
		int no=sc.nextInt();
		switch(seatType) {
		case 1: ms=MovieSeat.STANDARD;
		break;
		case 2: ms=MovieSeat.PREMIUM;
		break;
		case 3: ms=MovieSeat.RECLINER;
		break;
		default: System.out.println("No such type of seat available");
					System.exit(0);
		}
		System.out.println("Ticket Type:"+ms);
		System.out.println("Number of Tickets:"+no);
		System.out.println("Total Amount: "+no*(ms.price));
	}
}
