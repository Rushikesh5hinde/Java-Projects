package com.test7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmpHashMap {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Kunal");
		names.add("Abhi");
		names.add("Neha");
		names.add("Abhi");
		names.add("Kunal");
		names.add("Kunal");
		
		HashMap<String, Integer>hm=new HashMap<String, Integer>();
		
		for(String s:names) {
			if(hm.containsKey(s)) {
				int ct=hm.get(s);
				ct++;
				hm.put(s, ct);
			}else {
				hm.put(s, 1);
			}
		}
		
		for(Map.Entry<String, Integer>e:hm.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}
}
