package com.oops.inheritance;
class Laptop{
	private int noOfUSBPort;
	private int processorSpeed;
	
	public Laptop() {
		
	}
	public Laptop(int noOfUSBPort,int processorSpeed) {
		this.noOfUSBPort=noOfUSBPort;
		this.processorSpeed=processorSpeed;
	}
	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort=noOfUSBPort;
	}
	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}
	public int getProcessorSpeed() {
		return processorSpeed;
	}
	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
	
}
public class LaptopTest {
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.setNoOfUSBPort(4);
		l1.setProcessorSpeed(350);
		System.out.println("No of USB Ports:"+l1.getNoOfUSBPort());
		System.out.println("Processor speed:"+l1.getProcessorSpeed());
	}
}
