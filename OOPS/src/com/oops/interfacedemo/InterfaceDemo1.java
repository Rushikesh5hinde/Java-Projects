package com.oops.interfacedemo;

interface Payment{
	void pay(double amount);
}
class Cake implements Bakery,Payment{
	@Override
	public void bake() {
		System.out.println("Variety:Pinapple,chocolate");
		
	}
	@Override
	public void minOrder() {
		System.out.println("500g");
		
	}
	@Override
	public void pay(double amount) {
		System.out.println("Amount to pay:"+amount);
		
	}
	public void displayRates() {
		System.out.println("Pinapple:300");
		System.out.println("Chocolate:400");
	}
}
class Biscuit implements Bakery,Payment{

	@Override
	public void pay(double amount) {
		System.out.println("Amount to Pay:"+amount);
		
	}

	@Override
	public void bake() {
		System.out.println("Variety:chocochips,Almond");
		
	}

	@Override
	public void minOrder() {
		System.out.println("250g");
		
	}
	
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Bakery b;
		b=new Cake();
		b.bake();
		b.minOrder();
		
		b=new Biscuit();
		b.bake();
		b.minOrder();
	}
}
