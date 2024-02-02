package com.oops.assigmentoops;

import java.util.Scanner;

public class NatGameTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("Enter country name");
		name=sc.next();
		NationalGame n1=new NationalGame();
		n1.display(name);
	}
}
