package com.oops.diamondproblem;
interface India{
	 void showDetails();
		
}
interface Goa extends India{
	default void displayPopulation() {
		System.out.println("Goa state population");
	}
}
interface Punjab extends India{
	default void displayPopulation() {
		System.out.println("Punjab state population");
	}
}
class District implements Punjab,Goa{

	@Override
	public void displayPopulation() {
		System.out.println("District population");
	}

	@Override
	public void showDetails() {
		System.out.println("Details of District");
		
	}
	
}
public class DiamondProblemDemo {
	public static void main(String[] args) {
		District obj=new District();
		obj.displayPopulation();
		obj.showDetails();
	}
}
