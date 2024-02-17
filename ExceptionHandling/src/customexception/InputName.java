package customexception;

import java.util.Scanner;

public class InputName {
	static void inputName() {
		Scanner sc=new Scanner(System.in);
		
		
		try {
			System.out.println("Enter name:");
			String name=sc.next();
			if(name.length()<3)
				throw new InvalidNameException("No of characters should be greater than 3");
			
			System.out.println("Welcome "+name);
		}catch(InvalidNameException e) {
			System.out.println(e);
		}finally {
			sc.close();
		}
	}
	public static void main(String[] args) {
		inputName();
	}
}
