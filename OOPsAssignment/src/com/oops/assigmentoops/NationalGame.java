package com.oops.assigmentoops;

public class NationalGame {
	String cName;
	
	public void display(String name) {
		cName=name;
		
		switch(name) {
		case "India":
			System.out.println("Hocky");
			break;
		case "China":
			System.out.println("Table Tennis");
			break;
		case "Bangladesh":
			System.out.println("Kabaddi");
			break;
		case "Italy":
			System.out.println("Football");
			break;
		case "UnitedStates":
			System.out.println("Baseball");
			break;
			default:
				System.out.println("Invlid Input");
		}
	}
}
