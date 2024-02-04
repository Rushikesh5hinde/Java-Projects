package com.abstractclass;
interface Playable{
	void play();
}
class Football implements Playable{

	@Override
	public void play() {
		System.out.println("FootBall:No of Players:11");
		System.out.println("Outdoor game");
		
	}
	
}
class VolleyBall implements Playable{

	@Override
	public void play() {
		System.out.println("VolleyBall:No of Players:6");
		System.out.println("Indoor game");
	}
	
}
class BasketBall implements Playable{

	@Override
	public void play() {
		System.out.println("BasketBall:No of Players:5");
		System.out.println("Indoor game");
	}
	
}
public class AbstractClassDemo3 {
	public static void main(String[] args) {
		Playable p;
		
		p=new Football();
		p.play();
		System.out.println("---------------");
		p=new VolleyBall();
		p.play();
		System.out.println("---------------");
		p=new BasketBall();
		p.play();
		
	}
}
