package com.oops.abstractclass;

abstract class Bike{
	//instance var
	private int id;
	private String name;
	private double cost;
	
	//static var
	static String brandname;
	static float discount;
	
	static {
		brandname="Kawasaki";
	}
	//constructors:to initialize instance variable using
	//super keyword in child class
	
	Bike(){
		
	}
	public Bike(int id, String name, double cost) {
		
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public static String getBrandname() {
		return brandname;
	}
	public static void setBrandname(String brandname) {
		Bike.brandname = brandname;
	}
	
	//abstract method
	
	abstract void description();
	
	//static method
	
	//abstract and final cannot come together
	//abstract and static cannot come together
	
	
	public static void setDiscount(float discount) {
		Bike.discount=discount;
	}
	public static float getDiscount() {
		return Bike.discount;
	}
	
	//final method
	
	final void display() {
		System.out.println("Brand name:"+brandname);
		System.out.println("Discount on all bikes:"+discount);
		System.out.println("*********************");
		System.out.println("Id:"+id);
		System.out.println("Model:"+name);
		System.out.println("Cost:"+cost);
	}
}
class BasicBike extends Bike{
	private float avg;

	public BasicBike() {
		
	}

	public BasicBike(int id, String name, double cost,float avg) {
		super(id, name, cost);
		this.avg=avg;
	}
	@Override
	void description() {
		System.out.println("This is a normal bike");
		System.out.println("no of gears:4");
		System.out.println("Average:"+avg);
		
	}
	
}
class SportsBike extends Bike{
	private int gears;
	private float speed;
	public SportsBike() {
		
	}
	public SportsBike(int id, String name, double cost,int gears,float speed) {
		super(id, name, cost);
		this.gears=gears;
		this.speed=speed;
	}
	@Override
	void description() {
		System.out.println("This is a sports bike");
		System.out.println("No of gears:"+gears);
		System.out.println("Speed:"+speed);
		
	}
	
}
public class AbstractClassDemo2 {
	public static void main(String[] args) {
		Bike b;
		Bike.setDiscount(20);
		b=new BasicBike(101, "Shine", 70000, 45);
		
		b.display();
		System.out.println("-----------------------");
		b.description();
		System.out.println("=================================");
		b=new SportsBike(102, "Ninja", 200000, 6, 300);
		b.display();
		System.out.println("-----------------------");
		b.description();
	}
}
