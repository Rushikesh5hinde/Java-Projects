package com.test6;

public class InvalidNameException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidNameException(){
		super();
	}
	public InvalidNameException(String msg){
		super(msg);
	}
}
