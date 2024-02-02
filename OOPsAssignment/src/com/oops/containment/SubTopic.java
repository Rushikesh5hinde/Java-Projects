package com.oops.containment;

public class SubTopic {
	private int subid;
	private String subname;
	private Question question;
	public SubTopic() {
		
	}
	public SubTopic(int subid, String subname, Question question) {
		
		this.subid = subid;
		this.subname = subname;
		this.question = question;
	}
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "SubTopic [subid=" + subid + ", subname=" + subname + ", question=" + question + "]";
	}
	
}
