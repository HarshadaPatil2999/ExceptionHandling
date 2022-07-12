package costumException;

import java.util.Scanner;

public class InvalidPasswordMain {
	
	void validates(String password) throws InvalidPassword
	{  int c=0;
	
		for(int i=0;i<password.length();i++)
		{
		 if(password.charAt(i)>='0'&& password.charAt(i)<='9')
		  {
			c++;
		  }
	    }
		 if(c==0)
			{
				throw new InvalidPassword("password must contain digit");
			}
	       
		
		
	      System.out.println("password is valid:"+password);
	}
public static void main(String[] args)throws InvalidPassword 
{     
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter password");
       String password=sc.next();
	InvalidPasswordMain m=new InvalidPasswordMain();
	m.validates(password);
//	try {
//		m.validates(password);
//	}
//	catch (InvalidPassword e) 
//	{
//		
//		System.out.println(e.getMessage());
//		System.out.println(e.getClass());
//	//	e.printStackTrace();
//	}
}
}
