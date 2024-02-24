package com.comparatorassignment;

public class Emp implements Comparable<Emp>{
	private int id;
	private String name;
	private Profile profile;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, Profile profile) {
		super();
		this.id = id;
		this.name = name;
		this.profile = profile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", profile=" + profile + "]";
	}
	@Override
	public int compareTo(Emp o) {
		
//		return this.getProfile().getCountry().compareTo(o.getProfile().getCountry());
		if(this.getProfile().getCountry().equals(o.getProfile().getCountry()))
			return this.getProfile().getState().compareTo(o.getProfile().getState());
		else if(this.getProfile().getCountry().compareTo(o.getProfile().getCountry())>0)
			return 1;
		else
			return -1;
			
		
	}
	
	
}
