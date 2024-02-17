package methodoverriding;
class Parent1{
	int data=0;
	
	void printData() throws ArithmeticException
	{
		System.out.println(100/data);
	}
}
class Child1 extends Parent1{
	int val=0;
	
	void printData() throws RuntimeException,ArrayIndexOutOfBoundsException
	{
		if(val==0) {
			throw new ArithmeticException();
			
		}
		System.out.println(data/val);
	}
}
public class UncheckedException {

}
