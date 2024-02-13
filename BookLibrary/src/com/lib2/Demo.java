package com.lib2;

import com.lib.BookDriver;
import com.lib.Library;

public class Demo {
	public static void main(String[] args) {
		Library obj;
		obj=new BookDriver();
		boolean res=obj.deleteBook();
		if(res) {
			
			System.out.println("id not present");
	}else {
		System.out.println("Book deleted successfully");
	}
	}
}
