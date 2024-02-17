package methodoverriding;

import java.io.IOException;

class Parent2{
	int data=50;
	//throws checked exception
	
	void printData() throws IOException
	{
		System.out.println(data);
	}
	
	//child class:overriding:
}
class Child2 extends Parent2{
	int val=10;
}
public class CheckedException2 {

}
