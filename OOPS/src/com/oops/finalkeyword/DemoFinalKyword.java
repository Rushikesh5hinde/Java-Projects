package com.oops.finalkeyword;
//static final variable: 1.direct initialize 2.initialize through static block 
//static instance variable:1.initialize in all constructors 2.initialize through instance block
class Developer{
	int id;
	String name;
//	final static int hours=9;
	final String pan;
	
	final static int hours;
	//initialize through static block
	static {
		hours=8;
	}
	//initialize through instance block
//	{
//		pan="IRCPS123R";
//	}
	//initialize through constructors
	Developer(){
		pan="IRCPS123";
	}
	
	final void show() {
		System.out.println("Developer show()");
	}
}
class FullStack extends Developer{
	//cannot override method
//	void show() {
//		System.out.println("Fullstack show()");	
//	}
}
public class DemoFinalKyword {
	
}
