package com.oops.lab;

public class Product {
	private int pid;
	private String name;
	private String description;
	private double price;
	private int quantity;
	private double discount;
	private double totalPrice;
	private double discountPrice;
	public Product() {

	}

	public Product(int pid, String name, String description, double price, int quantity, double discount) {
		this();
		this.pid = pid;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
	}
	public double calTotalPrice() {
		totalPrice=price*quantity;
		return totalPrice;
	}
	public double calDiscountPrice() {
		totalPrice=calTotalPrice();
		discountPrice=totalPrice-(totalPrice*discount)/100;
		return discountPrice;
	}
	public void displayPrice() {
		System.out.println("Total Price:"+calTotalPrice());
		System.out.println("Price after discount:"+calDiscountPrice());
	}
}
