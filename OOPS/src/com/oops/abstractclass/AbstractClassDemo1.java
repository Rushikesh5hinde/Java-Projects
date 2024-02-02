package com.oops.abstractclass;

abstract class Language{
	abstract void details();
	
	void show() {
		System.out.println("Languages");
	}
}
class ProLang extends Language{
	@Override
	void details() {
		System.out.println("Java,.net,C,JavaScript");
		
	}
	void getName(String name) {
		System.out.println("Institute:"+name);
	}
}
class SpeakLang extends Language{
	@Override
	void details() {
		System.out.println("marathi,hindi,english");
		
	}
}
public class AbstractClassDemo1 {
	public static void main(String[] args) {
		Language l;
		
		l=new ProLang();
		l.details();
		l.show();
//		l.getName("ThinkQ");
		
		System.out.println("--------------------");
		l=new SpeakLang();
		l.details();
	}
}
