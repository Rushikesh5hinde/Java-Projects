package com.task24012024;
@FunctionalInterface
interface PayAmount{
	
	void payAmount(double amount);
}
class Celebrity implements PayAmount{
	private double tax;
	
	public Celebrity() {
		
	}
	public Celebrity(double tax) {
		this.tax=tax;
	}
	
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public void payAmount(double amount) {
		double total=amount-amount*(tax/100);
		System.out.println("Amount after tax deduction:"+total);
	}	
}
class Employee implements PayAmount{
	private double tax;
	
	public Employee() {
		
	}
	public Employee(double tax) {
		this.tax=tax;
	}
	
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public void payAmount(double amount) {
		double total=amount-amount*(tax/100);
		System.out.println("Amount after tax deduction:"+total);
	}	
}
class Student implements PayAmount{
	private double fees;
	
	public Student() {
		
	}
	public Student(double fees) {
		this.fees=fees;
	}
	@Override
	public void payAmount(double amount) {
		this.fees=amount;
		System.out.println("Fees:"+amount);
		
	}
	
}
public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		PayAmount p;
		
		p=new Celebrity(20);
		p.payAmount(10000);
		
		p=new Student();
		p.payAmount(20000);
		
		p=new Employee(10);
		p.payAmount(1000);
	}
}
