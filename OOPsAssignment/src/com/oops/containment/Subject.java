package com.oops.containment;

public class Subject {
	private int sid;
	private String sname;
	private Topic topic;
	public Subject() {
		
	}
	public Subject(int sid, String sname, Topic topic) {
		
		this.sid = sid;
		this.sname = sname;
		this.topic = topic;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	@Override
	public String toString() {
		return "Subject [sid=" + sid + ", sname=" + sname + ", topic=" + topic + "]";
	}
	
}
