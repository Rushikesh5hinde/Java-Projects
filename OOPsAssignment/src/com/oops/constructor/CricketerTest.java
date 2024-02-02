package com.oops.constructor;

import java.util.Scanner;

public class CricketerTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id,runs;
		String name;
		float strikerate;
		boolean baller;
		System.out.println("Enter player id");
		id=sc.nextInt();
		System.out.println("Enter player name");
		name=sc.next();
		System.out.println("player is bowler?? if yes then true, if not then false");
		baller=sc.nextBoolean();
		System.out.println("Enter strike rate");
		strikerate=sc.nextFloat();
		System.out.println("Enter runs");
		runs=sc.nextInt();
		Cricketer c1=new Cricketer(id, name, baller, strikerate, runs);
		c1.display();
		
	}
}
