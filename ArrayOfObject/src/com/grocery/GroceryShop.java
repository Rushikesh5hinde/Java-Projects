package com.grocery;

public class GroceryShop {
	public static void getItems(Supplier[] sups,String itemName) {
		for(Supplier s:sups) {
			for(Item i:s.getItems()) {
				if(i.getIname().equals(itemName)) {
					System.out.println(s.getSid()+" "+s.getSname()+" "+s.getMobile());
				}
			}
		}
	}
	public static void getItemsCommon(Supplier[] sups) {
		int ct=0;
		for(int i=0;i<sups.length;i++) {
			for(int j=i+1;j<sups.length;j++) {
				for(int k=0;k<sups[i].getItems().length;k++) {
					if(sups[i].getItems()[k].getIname().equals(sups[j].getItems()[k].getIname())) {
						System.out.println(sups[i].getSname());
						System.out.println(sups[j].getSname());
						
					}
					
				}
				
			}
			ct++;
		}
		System.out.println(ct);
	}
	public static void main(String[] args) {
		Supplier[] sups=new Supplier[3];
		
		Item[] i1=new Item[2];
		i1[0]=new Item(1, "Rice", 35);
		i1[1]=new Item(2, "Sugar", 30);
//		i1[2]=new Item(3, "Milk", 65);
		
		sups[0]=new Supplier(101, "Akash", 90289966, i1);
		
		Item[] i2=new Item[2];
		i2[0]=new Item(4, "Chocolates", 35);
		i2[1]=new Item(5, "Chips", 30);
		
		sups[1]=new Supplier(102, "Rekha", 77289966, i2);
		
		Item[] i3=new Item[2];
		i3[0]=new Item(6, "Chocolates", 65);
		i3[1]=new Item(7, "Breads", 30);
		
		sups[2]=new Supplier(102, "Madhuri", 60289978, i3);
		
//		for(Supplier s:sups) {
//			System.out.println(s.getSid()+" "+s.getSname()+" "+s.getMobile());
//			for(Item i:s.getItems()) {
//				System.out.println(i);
//			}
//			System.out.println("-------------------------------------");
//		}
//		
//		System.out.println("-------------------------");
//		getItems(sups, "Chocolates");
		
		getItemsCommon(sups);
	}
}
