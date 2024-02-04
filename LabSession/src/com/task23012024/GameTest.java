package com.task23012024;
class Game{
	protected int n;
	
	void rules() {
		System.out.println("follow the rules!");
	}
	void noOfPlayers() {
		System.out.println("No of players:"+n);
	}
}
class BasketBall extends Game{
	void rules() {
		System.out.println("player cannot run with the ball");
		System.out.println("no holding,pushing shall be allowed");
	}
	void noOfPlayers() {
		n=12;
		System.out.println("BasketBall:No of players:"+n);
	}
}
class Soccer extends Game{
	@Override
	void rules() {
		System.out.println("hand touch is not allowed");
		System.out.println("Shouldering not allowed");
	}
	@Override
	void noOfPlayers() {
		n=11;
		System.out.println("Soccer:no of players:"+n);
	}
}
class Cricket extends Game{
	@Override
	void rules() {
		System.out.println("ball tempering is not allowed");
	}
	@Override
	void noOfPlayers() {
		n=11;
		System.out.println("Cricket:No of players:"+n);
	}
}
public class GameTest {
	public static void main(String[] args) {
		Game g;
		g=new BasketBall();
		g.rules();
		g.noOfPlayers();
		System.out.println("------------------------");
		g=new Cricket();
		g.rules();
		g.noOfPlayers();
		System.out.println("------------------------");
		g=new Soccer();
		g.rules();
		g.noOfPlayers();
	}
}
