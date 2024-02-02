package com.oops.overriding;
class Vehicle{
	String accelerate(long mph) {
		return "accelerate()";
	}
	String run() {
		return "run()";
	}
	String stop() {
		return "Stop()";
	}
}
class Car extends Vehicle{
	@Override
	String accelerate(long mph) {
		return "Car accelerate at:"+mph+" mph";
	}
}
public class VehicleTest {
	public static void main(String[] args) {
		Vehicle v;
		v=new Car();
		System.out.println(v.accelerate(20));
	}
}
