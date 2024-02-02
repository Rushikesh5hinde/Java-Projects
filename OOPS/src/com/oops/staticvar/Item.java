package com.oops.staticvar;

public class Item {
	private int itemid;
	private String iname;
	private double cost;
	private int qty;
	static int icount=0;
	static String brand;
	static
	{
		System.out.println("Static block");
		brand="Nestle";
	}
	{
		System.out.println("instance block");
		icount++;
	}
	Item(){
		
	}
	Item(int itemid,String iname,double cost,int qty){
		this();
		this.itemid=itemid;
		this.iname=iname;
		this.cost=cost;
		this.qty=qty;
	}
	public void setItemid(int itemid) {
		this.itemid=itemid;
	}
	public int getItemid() {
		return itemid;
	}
	public void setIname(String iname) {
		this.iname=iname;
	}
	public String getIname() {
		return iname;
	}
	public void setCost(double cost) {
		this.cost=cost;
	}
	public double getCost() {
		return cost;
	}
	public void setQty(int qty) {
		this.qty=qty;
	}
	public double calTotalPrice() {
		double totalPrice=qty*cost;
		return totalPrice;
	}
	public double calDiscountPrice(double discount) {
		double total=calTotalPrice();
		double discPrice=total-(total*discount)/100;
		return discPrice;
	}
	
	public String toString() {
		return "Brand:"+brand+" "+itemid+" "+iname+"  "+cost+" Total:"+calTotalPrice();
	}
}
