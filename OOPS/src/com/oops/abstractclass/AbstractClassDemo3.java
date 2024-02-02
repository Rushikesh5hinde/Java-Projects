package com.oops.abstractclass;
abstract class Food{
	//instance variable
	private String taste;
	private String color;
	protected static float price;
	public Food() {
		
	}
	public Food(String taste,String color) {
		this.taste=taste;
		this.color=color;
	}
	//instance method
	public void setTaste(String taste) {
		this.taste=taste;
	}
	public String getTaste() {
		return taste;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	//static method
	public static void setPrice(float price) {
		
		Food.price=price;
	}
	public static float getPrice() {
		return price;
	}
	//abstract method
	public abstract void getOrder();
}

public class AbstractClassDemo3 {

}
