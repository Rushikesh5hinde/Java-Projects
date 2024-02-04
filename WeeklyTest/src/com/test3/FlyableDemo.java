package com.test3;

interface Flyable{

	void flyObj();
}
class Spacecraft implements Flyable{
	public void flyObj(){
		System.out.println("Spacecraft is flying!");
	}
}
class Airplane implements Flyable{
	public void flyObj(){
		System.out.println("Airplane is flying!");
	}
}
class Helicopter implements Flyable{
	public void flyObj(){
		System.out.println("Helicopter is flying!");
	}
}
public class FlyableDemo{
	public static void main(String[] args){
		Flyable f1;
		f1=new Spacecraft();
		f1.flyObj();

		f1=new Airplane();
		f1.flyObj();

		f1=new Helicopter();
		f1.flyObj();
	}

}
