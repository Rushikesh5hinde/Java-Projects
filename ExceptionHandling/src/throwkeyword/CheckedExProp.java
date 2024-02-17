package throwkeyword;

import java.io.IOException;

//in case of checked exception, if you are not handling exception then propagation is compulsory
//we need to inform JVM using throws keyword
public class CheckedExProp {
	
	void method3() throws IOException 
	{
		throw new IOException("Invalid Input");
	}
	void method2() throws IOException {
		method3();
	}
	void method1() {
		try {
			method2();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		CheckedExProp obj=new CheckedExProp();
		obj.method1();
	}
}
