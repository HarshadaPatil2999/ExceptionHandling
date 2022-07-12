package costumException;

import java.util.Scanner;

public class NegativeExceptionMain {
	
	public static void main(String[] args) throws NegativeException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		if(id<0)
		{
			throw new NegativeException(" id should not be negative");
		}
		else
			System.out.println(id);
	}
     
}
