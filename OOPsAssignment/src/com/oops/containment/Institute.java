package com.oops.containment;

public class Institute {
	private int instId;
	private String instName;
	private Branch branch;
	public Institute() {
		
	}
	public Institute(int instId, String instName, Branch branch) {
	
		this.instId = instId;
		this.instName = instName;
		this.branch = branch;
	}
	public int getInstId() {
		return instId;
	}
	public void setInstId(int instId) {
		this.instId = instId;
	}
	public String getInstName() {
		return instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Institute [instId=" + instId + ", instName=" + instName + ", branch=" + branch + "]";
	}
	
}
