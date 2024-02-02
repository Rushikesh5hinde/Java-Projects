package com.oops.constructor;

public class Academy {
	private int aid;
	private String aname;
	
	public Academy() {
		
	}
	public Academy(int aid,String aname) {
		this.aid=aid;
		this.aname=aname;
	}
	public void setAid(int aid) {
		this.aid=aid;
	}
	public int getAid() {
		return aid;
	}
	public void setAname(String aname) {
		this.aname=aname;
	}
	public String getAname() {
		return aname;
	}
}
