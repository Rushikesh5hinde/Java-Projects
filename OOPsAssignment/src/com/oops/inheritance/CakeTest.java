package com.oops.inheritance;
interface Cake{
	void bake();
}
class Strawberry implements Cake{

	@Override
	public void bake() {
		System.out.println("Strawberry");
		
	}
	
}
class BlackForest implements Cake{

	@Override
	public void bake() {
		System.out.println("BlackForest");
		
	}
	
}
public class CakeTest {
	public static void main(String[] args) {
		Cake c;
		c=new Strawberry();
		c.bake();
		c=new BlackForest();
		c.bake();
	}
}
