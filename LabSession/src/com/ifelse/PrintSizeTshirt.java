package com.ifelse;

import java.util.Scanner;

public class PrintSizeTshirt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter size of Tshirt");
		size=sc.nextInt();
		if(size>=30 && size<=34) {
			System.out.println("Small Size!");
		}else if(size>=35 && size<=38) {
			System.out.println("Medium Size!");
		}else if(size>=39 && size<=41) {
			System.out.println("Large Size!");
		}else if(size>=42 && size<=44) {
			System.out.println("Extra Large!");
		}else {
			System.out.println("Invalid Input");
		}
	}
}
