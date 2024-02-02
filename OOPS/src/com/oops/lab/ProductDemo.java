package com.oops.lab;

public class ProductDemo {
	private int pid;
	private String name;
	private String description;
	private double price;
	private int quantity;
	private double discount;
	private double totalPrice;
	private double discountPrice;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getTotalPrice() {
		totalPrice=price*quantity;
		return totalPrice;
	}
	public double getDiscountPrice() {
		totalPrice=getTotalPrice();
		discountPrice=totalPrice-(totalPrice*discount)/100;
		return discountPrice;
	}
	public void displayPrice() {
		System.out.println("Total Price:"+getTotalPrice());
		System.out.println("Price after discount:"+getDiscountPrice());
	}
	
}
