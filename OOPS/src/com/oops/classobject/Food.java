package com.oops.classobject;

public class Food {
	int foodId;
	String foodName;
	double foodPrice;
	
//	public void setFood(int fid,String fname,double fprice) {
//		foodId=fid;
//		foodName=fname;
//		foodPrice=fprice;
//	}
	public void setFood(int foodId,String foodName,double foodPrice) {
		this.foodId=foodId;
		this.foodName=foodName;
		this.foodPrice=foodPrice;
	}
	public void showFood() {
		System.out.println("Food Id:"+foodId);
		System.out.println("Food Name:"+foodName);
		System.out.println("Food Price:"+foodPrice);
		System.out.println("------------------------");
	}
}
