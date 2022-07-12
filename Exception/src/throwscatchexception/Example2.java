package throwscatchexception;

import java.io.IOException;

class AB{
	
	
//	AB display()
//	{
//		return new AB();
//	}
	
	void display()  throws IOException              //throws ArithmeticException
	{
		System.out.println("Parent class");
	}
	
}

class BC{
	
//	AB display()
//	{
//		return new AB();
//	}
//	
//	BC display()
//	{
//		return new BC();
//	}
	void display() throws ClassNotFoundException//if in parent class compile type exception is given then in 
	//child class child class of given exception is allowed 
//	throws SQLException //it is not allowed.it is position is same as parent class exception
	// throws IOException  // compile type is not allowed in child class if in parent class the exception is not present     
	    // throws ArithmeticException//runtime exception is allowed when the exception is may or  not in parent class
	{
		System.out.println(" Child class");
	}
}



public class Example2 {
	public static void main(String[] args) {
		
	}

}
