package com.methodoverload;

public class Author {
	private int authId;
	private String authName;
	
	public Author() {
		
	}
	public Author(int authId,String authName) {
		this.authId=authId;
		this.authName=authName;
	}
	public void setAuthId(int authId) {
		this.authId=authId;
	}
	public int getAuthId() {
		return authId;
	}
	public void setAuthName(String authName) {
		this.authName=authName;
	}
	public String getAuthName() {
		return authName;
	}
	public String toString() {
		return "Id:"+authId+" Name:"+authName;
	}
}
