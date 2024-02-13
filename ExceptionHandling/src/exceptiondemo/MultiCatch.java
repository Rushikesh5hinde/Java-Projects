package exceptiondemo;

import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			int[] arr=new int[3];
			System.out.println("Enter values:");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("--------------------------");
			for(int i=0;i<arr.length;i++) {
				System.out.println("ans: "+(100/arr[i]));
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e+":Index is greater");
		}catch(ArithmeticException e) {
			System.out.println(e+":array element cannot be zero");
		}
		catch(Exception e) {
			System.out.println(e);
		}finally {
			sc.close();
			System.out.println("In fnally block");
		}
		System.out.println("End");
	}
}
