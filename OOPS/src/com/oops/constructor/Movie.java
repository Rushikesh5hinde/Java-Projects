package com.oops.constructor;

public class Movie {
	private int movieid;
	private String moviename;
	
	{
		System.out.println("Welcome");
	}
	{
		System.out.println("IIB");
	}
	public Movie() {
		System.out.println("default");
	}
	public Movie(int movieid,String moviename) {
		this();
		this.movieid=movieid;
		this.moviename=moviename;
		System.out.println("Para");
	}
}
