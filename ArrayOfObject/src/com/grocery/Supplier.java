package com.grocery;

import java.util.Arrays;

public class Supplier {
	private int sid;
	private String sname;
	private long mobile;
	
	private Item[] items;

	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Supplier(int sid, String sname, long mobile, Item[] items) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.mobile = mobile;
		this.items = items;
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Supplier [sid=" + sid + ", sname=" + sname + ", mobile=" + mobile + ", items=" + Arrays.toString(items)
				+ "]";
	}
	
}
