package com.oops.inheritance;
class Food{
	void bake() {
		
	}
}
class Biryani extends Food{
	@Override
	void bake() {
		System.out.println("Bake the Biryani!");
	}
}
public class SingleLevelTest2 {
	public static void main(String[] args) {
		Food obj;
		obj=new Biryani();
		obj.bake();
	}
}
