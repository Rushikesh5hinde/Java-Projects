package com.array;
/*9. Write a Java program to test the equality of two arrays. Means e.g arr1[] = [12, 22, 
32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22] 
Here both arrays are equal*/
public class Que9 {
	static boolean checkEqual(int[] arr1,int[] arr2) {
		int ct;
		for(int i=0;i<arr1.length;i++) {
			ct=1;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					ct++;
				}
			}
			if(ct!=2) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] arr1= {12,22,32, 42, 52, 62};
		int[] arr2= {52, 22, 62, 12, 42, 22};
		
		if(checkEqual(arr1, arr2)) {
			System.out.println("both arrays are equal");
		}else {
			System.out.println(" arrays are not equal");
		}
	}
}
