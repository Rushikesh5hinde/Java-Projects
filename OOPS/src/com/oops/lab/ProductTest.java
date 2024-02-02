package com.oops.lab;

public class ProductTest {
	public static void main(String[] args) {
//		Product p1=new Product(1, "abc", "xyz", 10000, 20, 10);
//		p1.displayPrice();
		
		ProductDemo obj=new ProductDemo();
		obj.setPid(1);
		obj.setName("abc");
		obj.setDescription("xyz");
		obj.setPrice(10000);
		obj.setQuantity(20);
		obj.setDiscount(10);
		
		obj.displayPrice();
	}
}
