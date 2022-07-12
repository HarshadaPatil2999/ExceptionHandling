package costumException;
                                  //if we want run time exception then extend RuntimeException
public class AgeException extends Exception {//compile time exception
	
	public AgeException(String s)//create constructor and call the parent class variable.
	{
		super(s);
	}
	

}
