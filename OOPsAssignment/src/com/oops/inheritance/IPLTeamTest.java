package com.oops.inheritance;
class IPLTeam{
	void play() {
		
	}
}
class CSK extends IPLTeam{
	@Override
	void play() {
		System.out.println("CSK is playing");
	}
}
class RCB extends IPLTeam{
	@Override
	void play() {
		System.out.println("RCB is playing");
	}
}
public class IPLTeamTest {
	public static void main(String[] args) {
		RCB obj1=new RCB();
		obj1.play();
		
		CSK obj2=new CSK();
		obj2.play();
	}
}
