package throwkeyword;

import java.util.Scanner;

public class AgeDemo {
	static void enterAge() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		try {
			if(age<0) {
				throw new RuntimeException("Age should not be less than 0");
			}else {
				System.out.println("Age:"+age);
			}
		}catch(RuntimeException ex) {
			System.out.println("in catch block enterAge()");
			throw ex;
		}
		
		System.out.println("Rest Code");
	}
	public static void main(String[] args) {
		try {
			enterAge();
		}catch(Exception e) {
			System.out.println("In main catch");
			System.out.println(e);
		}
	}
}
