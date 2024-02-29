package com.map1;

import java.util.Objects;

public class Department {
	private int did;
	private String dname;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(did, dname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return did == other.did && Objects.equals(dname, other.dname);
	}
	
}
