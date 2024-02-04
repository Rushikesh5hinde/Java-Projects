package com.test3;

class Room{
	protected int roomno;
	protected String roomtype;
	protected double roomarea;
	protected boolean Acmachine;

	public Room(){
	}
	public Room(int roomno,String roomtype,double roomarea,boolean Acmachine){
		this.roomno=roomno;
		this.roomtype=roomtype;
		this.roomarea=roomarea;
		this.Acmachine=Acmachine;
	}
	public void setRoomNo(int roomno){
		this.roomno=roomno;
	}
	public int getRoomNo(){
		return roomno;
	}
	public void setRoomType(String roomtype){
		this.roomtype=roomtype;
	}
	public String getRoomType(){
		return roomtype;
	}
	public void setRoomArea(double roomarea){
		this.roomarea=roomarea;
	}
	public double getRoomArea(){
		return roomarea;
	}
	public void setAcmachine(boolean Acmachine){
		this.Acmachine=Acmachine;
	}
	public boolean getAcmachine(){
		return Acmachine;
	}
	public void displayData(){
		System.out.println("Room No:"+getRoomNo());
		System.out.println("Room Type:"+getRoomType());
		System.out.println("Room Area:"+getRoomArea());
		System.out.println("AC Machine Available:"+getAcmachine());
	}
}
class DeluxeRoom extends Room{
	protected double price;
	public DeluxeRoom(){
	}
	public DeluxeRoom(int roomno,String roomtype,double roomarea,boolean Acmachine,double price){
		super(roomno,roomtype,roomarea,Acmachine);
		this.price=price;
	}
	@Override
	public void displayData(){
		System.out.println("Deluxe Room");
		super.displayData();
		System.out.println("Price:"+price);
	}
}
class BasicRoom extends Room{
	public BasicRoom() {
		
	}
	public BasicRoom(int roomno,String roomtype,double roomarea,boolean Acmachine) {
		super(roomno,roomtype,roomarea,Acmachine);
	}
	@Override
	public void displayData(){
		System.out.println("Basic Room");
		super.displayData();
	}
}
class SuperDeluxeRoom extends Room{
	public SuperDeluxeRoom() {
		
	}
	public SuperDeluxeRoom(int roomno,String roomtype,double roomarea,boolean Acmachine) {
		super(roomno,roomtype,roomarea,Acmachine);
	}
	@Override
	public void displayData(){
		System.out.println("Super Deluxe Room");
		super.displayData();
	}
}
public class RoomTest{
	public static void main(String[] args){
		Room r1;
		r1=new DeluxeRoom(101,"Deluxe",1000,true,3000);
		r1.displayData();
		
		r1=new BasicRoom(102,"Basic",1500,false);
		r1.displayData();
		
		r1=new SuperDeluxeRoom(103,"SuperDeluxe",1500,true);
		r1.displayData();
	}
}
