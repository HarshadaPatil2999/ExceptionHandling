package costumException;

public class AgeExceptionExample {
	
	
	void validite( int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("age is less,not allowed for Roller Coster ride");
		}
		
		else if(age>60)
		{
			throw new AgeException("age is greater,not allowed for Roller Coster ride");
		}
		else
			System.out.println("Enjoy the ride..");
	}
	
	
		public static void main(String[] args) {
		
			
			int age=40;
			AgeExceptionExample a= new AgeExceptionExample();
			
			try {
				a.validite(age);
			} 
			catch (AgeException e)
			{
				
				e.printStackTrace();
			}
			
			System.out.println("done");
	}

}
