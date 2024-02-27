package com.test7;

import java.util.ArrayList;


public class StudentArrayList {
	static void countFrequency(ArrayList<String> list){
		int ct;
		boolean status;
		for(int i=0;i<list.size();i++){
			ct=1;
			status=false;

			for(int k=i-1;k>=0;k--){
				if(list.get(i).equals(list.get(k))){
					status=true;
					break;
				}
			}
			if(status==false){
				for(int j=i+1;j<list.size();j++){
				if(list.get(i).equals(list.get(j))){
					ct++;
					}
				}
				System.out.println(list.get(i)+":"+ct);
			}
		}
	}

	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<>();
		list.add("Kunal");
        	list.add("Neha");
       	 	list.add("Mandar");
       		list.add("Kunal");
		
       		for(String s:list) {
       			System.out.println(s);
       		}
       		System.out.println("--------------------------------");
		countFrequency(list);
		
	}
}
