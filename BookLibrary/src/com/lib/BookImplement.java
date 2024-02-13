package com.lib;

import java.util.Scanner;

public class BookImplement {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Book[] b=new Book[5];
		Library obj;
		obj=new BookDriver();
		int id;
		String name,aname;
		double price;
		int count=0;
		while(true) {
			System.out.println("1.Add Book\n2.Update Book Price by id\n3.Delete book By id\n4.Search Book by id"
					+ "\n5.search by book name\n6.show all books\n7.exit");
			
			System.out.println("Enter choice:");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				{
					obj.addBook();
					break;
				}
			case 2:
				{
					obj.updateBook();
					break;
				}
			case 3:
			{
				boolean res=obj.deleteBook();
				if(res) {
					
						System.out.println("id not present");
				}else {
					System.out.println("Book deleted successfully");
				}
				break;
			}
			case 4:
			{
				obj.searchBookById();
				break;
			}
			case 5:
			{
				obj.searchBookByName();
				break;
			}
			case 6:
				{
					obj.showBooks();
					break;
				}
			case 7:
				obj.exit();
				break;
			}
		}
	}
}
