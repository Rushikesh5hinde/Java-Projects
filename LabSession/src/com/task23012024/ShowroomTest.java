package com.task23012024;
class Showroom{
	final static int showroomid;
	final String showroomname;
	static {
		showroomid=101;
	}
	{
		showroomname="Honda";
	}
	final void empRules() {
		System.out.println("follow the rules!");
	}
}
class BikeShowRoom extends Showroom{
//	void empRules() {
//		
//	}
}
public class ShowroomTest {

}
