package throwkeyword;

import java.util.Scanner;


public class StudentDemo {
	public static void enterStudentDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name:");
		String name=sc.next();
		
		System.out.println("Enter marks:");
		double marks=sc.nextDouble();
		
		try {
			if(marks<0 || marks>100) {
				throw new RuntimeException("Enter Marks between 0 and 100");
			}else {
				if(marks>=35) {
					System.out.println(name+" has cleared the exam");
				}else {
					System.out.println(name+" has failed!");
				}
			}
		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println(e);
		}
		
		System.out.println("Rest Code");
	}
	public static void main(String[] args) {
		enterStudentDetails();
	}
}
