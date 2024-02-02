package com.oops.interfacedemo;
interface MessagesS{
	void sendMessages(String msg);
}
class Whatsapp implements MessagesS{
	String type;
	public Whatsapp() {
		
	}
	@Override
	public void sendMessages(String msg) {
		this.type="Whatsapp";
		System.out.println(type+":"+msg);
		
	}
}
class Telegram implements MessagesS{
	String type;
	public Telegram() {
		
	}
	@Override
	public void sendMessages(String msg) {
		this.type="Telegram";
		System.out.println(type+":"+msg);
		
	}
}
public class TightCouplingDemo {
	//tight coupling
	
//	public void notifyMsg(Whatsapp w,String msg) {
//		w.sendMessages(msg);
//	}
	
	//loose coupling
	
	public void notifyMsg(MessagesS m,String msg) {
		m.sendMessages(msg);
	}
	public static void main(String[] args) {
		TightCouplingDemo obj=new TightCouplingDemo();
		
//		Whatsapp w1=new Whatsapp();
//		obj.notifyMsg(w1, "Welcome");
//		
//		Telegram t1=new Telegram();
//		obj.notifyMsg(t1, "Hello");
		
		MessagesS m;
		m=new Whatsapp();
		obj.notifyMsg(m, "Welcome");
		
		m=new Telegram();
		obj.notifyMsg(m, "Hello");
	}
}
