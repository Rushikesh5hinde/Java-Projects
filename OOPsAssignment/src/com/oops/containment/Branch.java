package com.oops.containment;

public class Branch {
	private int bid;
	private String bname;
	private Subject subject;
	public Branch() {
		
	}
	public Branch(int bid, String bname, Subject subject) {
		
		this.bid = bid;
		this.bname = bname;
		this.subject = subject;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Branch [bid=" + bid + ", bname=" + bname + ", subject=" + subject + "]";
	}
	
}
