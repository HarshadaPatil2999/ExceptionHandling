package throwscatchexception;

public class Example1 {
	
	
	

	int getStringLength(String s)throws NullPointerException
	{
		if(s==null)
		{
	throw new NullPointerException("String is null");
		}
		
		return s.length();
	}
	
	public static void main(String[] args) //throws NullPointerException it is hold the program exicution
	{
		
		Example1 e=new Example1();
		
		System.out.println(e.getStringLength("India"));
	try { //when method is not depened to another method then use try catch.either throw exception will be use
		System.out.println(e.getStringLength(null));
		}
		catch(NullPointerException e1)
		{
			e1.printStackTrace();
//			throw new NullPointerException("String is null...Enter valid string");it is hold the program execution.
		}
		
		System.out.println(e.getStringLength("Maharashtra"));
		System.out.println(e.getStringLength("Mumbai"));
		
	}

}
