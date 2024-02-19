package com.test6;

public class StudentDemo {
	static void checkName(String[] st){
		for(int i=0;i<st.length;i++){
			if(st[i].length()<3){
				throw new InvalidNameException("Invalid Name");
			}else {
				System.out.println(st[i]);
			}
		}
	}
	public static void main(String[] args){
		String[] st={"Rahul","Akash","Onkar","Om"};

		try{
			checkName(st);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
