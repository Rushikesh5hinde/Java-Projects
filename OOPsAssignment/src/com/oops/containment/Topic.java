package com.oops.containment;

public class Topic {
	private int topicid;
	private String topicname;
	private SubTopic subTopic;
	public Topic() {
		
	}
	public Topic(int topicid, String topicname, SubTopic subTopic) {
		
		this.topicid = topicid;
		this.topicname = topicname;
		this.subTopic = subTopic;
	}
	public int getTopicid() {
		return topicid;
	}
	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}
	public String getTopicname() {
		return topicname;
	}
	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}
	public SubTopic getSubTopic() {
		return subTopic;
	}
	public void setSubTopic(SubTopic subTopic) {
		this.subTopic = subTopic;
	}
	@Override
	public String toString() {
		return "Topic [topicid=" + topicid + ", topicname=" + topicname + ", subTopic=" + subTopic + "]";
	}
	
}
