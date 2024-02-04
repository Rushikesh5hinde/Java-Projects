package com.revision;
class Demo{
	static int a;
	int b;
	
	public Demo() {
		a++;
		b++;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
public class StaticInstnceDemo {
	public static void main(String[] args) {
		Demo d1=new Demo();
		
		
		Demo d2=new Demo();
		Demo d3=new Demo();
	}
}
