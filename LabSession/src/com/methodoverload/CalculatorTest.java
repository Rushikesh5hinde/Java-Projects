package com.methodoverload;

import java.util.Scanner;

class Calculator{
	private double pAmount;
	private double loanAmount;
	
	public Calculator() {
		
	}
	public Calculator(double pAmount) {
		this();
		this.pAmount=pAmount;
	}
	public void setPAmount(double pAmount) {
		this.pAmount=pAmount;
	}
	public double getPAmount() {
		return pAmount;
	}
	public String loanAmount(double rate) {
		loanAmount=pAmount*(100+rate);
		return "Housing Loan:"+loanAmount;
	}
	public String loanAmount(double rate1,double rate2) {
		loanAmount=pAmount*(100+rate1+rate2);
		return "Commercial Loan:"+loanAmount;
	}
}
public class CalculatorTest {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Calculator c1=new Calculator(10000);
		
//		System.out.println("Enter principal Amount");
//		c1.setPAmount(sc.nextDouble());
		
		System.out.println(c1.loanAmount(0.08));
		System.out.println(c1.loanAmount(0.08,0.05));
	}
}
