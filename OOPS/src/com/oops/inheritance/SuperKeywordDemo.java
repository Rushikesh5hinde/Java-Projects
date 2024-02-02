package com.oops.inheritance;

class Parent{
	int value;
	
	Parent(){
		
	}
	Parent(int value){
		System.out.println("Parent class para constructor");
		this.value=value;
	}
}
class Child extends Parent{
	int data;
	Child(){
		
	}
	Child(int data,int value){
		super(value);
		System.out.println("Child class para constructor");
		this.data=data;
	}
}

public class SuperKeywordDemo {
	public static void main(String[] args) {
		Child obj=new Child(100,10);
		System.out.println("Data"+obj.data);
		System.out.println("Value:"+obj.value);
	}
}
