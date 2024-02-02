package com.oops.classobject;

public class FoodTest {
	public static void main(String[] args) {
		Food f1=new Food();
		Food f2=new Food();
		Food f3=new Food();
		
		f1.setFood(11, "Pulav", 100);
		f2.setFood(12, "Biryani", 150);
		f3.setFood(13, "Pav Bhaji", 200);
		
		f1.showFood();
		f2.showFood();
		f3.showFood();
	}
}
