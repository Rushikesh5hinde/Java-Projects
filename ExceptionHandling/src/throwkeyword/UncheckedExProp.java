package throwkeyword;
//in case of unchecked exception,propagation is not compulsory
public class UncheckedExProp {
	
	void method3() {
		int data=30/0;
	}
	void method2() {
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
		UncheckedExProp obj=new UncheckedExProp();
		obj.method1();
	}
}
