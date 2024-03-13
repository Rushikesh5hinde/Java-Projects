package com.mapassignment;

import java.util.ArrayList;
import java.util.Objects;

public class Dept {
	private int did;
	private String sname;
	private ArrayList<Student> list;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int did, String sname, ArrayList<Student> list) {
		super();
		this.did = did;
		this.sname = sname;
		this.list = list;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public ArrayList<Student> getList() {
		return list;
	}
	public void setList(ArrayList<Student> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", sname=" + sname + ", list=" + list + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(did, list, sname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dept other = (Dept) obj;
		return did == other.did && Objects.equals(list, other.list) && Objects.equals(sname, other.sname);
	}
	
}
