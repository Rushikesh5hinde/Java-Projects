package com.oops.constructor;
class Food{
	
	public Food getFood() {
		return new Food();
	}
}
class Cake extends Food{
//	@Override
//	public Food getFood() {
//		return new Cake();
//	}
	@Override
	public Cake getFood() {
		return new Cake();
	}
}
public class CovarientReturnType {
	public static void main(String[] args) {
		Cake c1=new Cake();
//		Cake c2=(Cake) c1.getFood();
		
		Cake c2=c1.getFood();
	}
}
