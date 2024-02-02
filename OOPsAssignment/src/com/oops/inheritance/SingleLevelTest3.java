package com.oops.inheritance;
class Device{
	void charge() {
		
	}
}
class Mobile extends Device{
	@Override
	void charge() {
		System.out.println("Charge your mobile");
	}
}
public class SingleLevelTest3 {
	public static void main(String[] args) {
		Device obj;
		obj=new Mobile();
		obj.charge();
	}
}
