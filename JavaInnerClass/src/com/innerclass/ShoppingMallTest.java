package com.innerclass;
class ShoppingMall{
	
	public void doShopping() {
		
		class Cart{
			int itemid;
			String itemname;
			
			public void displayCart() {
				System.out.println("Item Id:"+itemid);
				System.out.println("Item name:"+itemname);
			}
			
		}
		Cart obj=new Cart();
		obj.itemid=101;
		obj.itemname="Sugar";
		
		obj.displayCart();
	}
}
public class ShoppingMallTest {
	public static void main(String[] args) {
		ShoppingMall obj=new ShoppingMall();
		obj.doShopping();
	}
}
