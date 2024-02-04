package com.task24012024;
interface Food{
	
	//abstract method
	
	void showDetails();
	
	//default method
	
	default void minOrder() {
		System.out.println("provide min order details");
		
		//we can call private method in default
		
		getRecipe();
	}
	
	//private method:used for confidential info
	
	private void getRecipe() {
		System.out.println("do not share recipe");
	}
	
	//static method:common implementation
	
	static float getDiscount() {
		return 0.2f;
	}
}
class Cake implements Food{

	@Override
	public void showDetails() {
		System.out.println("Type of cakes:Chocolate,Pinapple");
	}
	@Override
	public void minOrder() {
		System.out.println("Min Order:250g and above");
		
		//to call default method of interface
		
		Food.super.minOrder();
	}
	
}
class Biryani implements Food{

	@Override
	public void showDetails() {
		System.out.println("Type of Biryani:Veg,Non veg");
	}
	@Override
	public void minOrder() {
		System.out.println("Min Order:500g and above");
	}
	
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Food obj;
		System.out.println("Discount Applied:"+Food.getDiscount());
		System.out.println("----------------------------------------");
		obj=new Cake();
		obj.minOrder();
		obj.showDetails();
		
		
//		System.out.println("------------------------");
//		
//		obj=new Biryani();
//		obj.minOrder();
//		obj.showDetails();
		
	}
}
