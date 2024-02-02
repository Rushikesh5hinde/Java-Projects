package com.oops.overriding;
class Bike{
	String color;
	float speed;
	Bike(){
		
	}
	Bike(String color,float speed){
		this();
		this.color=color;
		this.speed=speed;
	}
	
	void bikeInfo() {
		System.out.println("Color:"+color);
		System.out.println("Speed:"+speed);
	}
}
class Pulsar extends Bike{
	Pulsar(){
		super();
	}
	Pulsar(String color,float speed){
		super(color,speed);
	}
	@Override
	void bikeInfo() {
		
		super.bikeInfo();
	}
}
public class BikeDemo {
	public static void main(String[] args) {
		Bike b;
		b=new Pulsar("Black", 100);
		b.bikeInfo();
	}
}
