package throwkeyword;

import java.io.IOException;

public class ThrowsDemo {
	//throws mainly used for checked exceptions
	//we can also use it for unchecked
	//multiple exceptions can declared along with throws
	
	public static void main(String[] args) throws IOException,ArithmeticException,RuntimeException
	{
		//we cannot create and throw two exceptions 
		throw new IOException();
//		throw new ArithmeticException();
	}
}
