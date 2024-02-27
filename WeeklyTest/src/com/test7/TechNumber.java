package com.test7;

import java.util.Scanner;

public class TechNumber {
	public static int power(int base,int raise){
		int pow=1;
		for(int i=0;i<raise;i++){
			pow=pow*base;
		}

		return pow;
	}

	public static int digitCount(int num){
		int ct=0;
		while(num!=0){
			num/=10;
			ct++;
		}
		return ct;
	}
	public static boolean isTech(int num){
		int ct=digitCount(num);
		
		if(ct%2!=0)
		return false;
		else
		{
			int temp=num;
			int sum;
			
				int rem=num%power(10,ct/2);
				num=num/power(10,ct/2);
				sum=rem+num;
				
			
			return ((sum*sum)==temp);
		}
	}
 	public static void main(String args[]) 
        {
            Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();

		if(isTech(num))
		System.out.println(num+" Number is Tech");
		else
		System.out.println(num+" is not a Tech Number");
        }
}
