package com.oops.staticfinal;

public class FinalDemo {
	final int x=10;
	//Que-10b,Que-11
	public final void method2() {
		System.out.println("FinalDemo method2()");
	}
	//Que-12
	private void showDetails() {
		System.out.println("private method parent");
	}
	public static void main(String[] args) {
		FinalDemo obj=new FinalDemo();
		//Que-10a
//		obj.x=100;
	}
}
//Que-10b
//final class FinalDemoChild extends FinalDemo{
class FinalDemoChild extends FinalDemo{
//	@Override
//	public  void method2() {
//		System.out.println("FinalDemo method2()");
//	}
//	@Override
//	 void showDetails() {
//		System.out.println("private method parent");
//	}
}
//Que-10c
//class DemoChild extends FinalDemoChild{
//	
//}
