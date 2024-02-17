package throwkeyword;

public class RethrowException {
	static void method1() {
		String s=null;
		
		try {
			System.out.println(s.length());
		}catch(Exception e) {
			System.out.println("in method1 catch");
			throw e;
		}
	}
	public static void main(String[] args) {
		try {
			method1();
		}catch(Exception e) {
			System.out.println("In main catch");
		}
	}
}
