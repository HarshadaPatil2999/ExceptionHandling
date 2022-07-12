package writtenTest;

import java.util.Scanner;

public class NumberExceptionExample {
	
	void NumberException(int a,int b) throws NumberException
	{
		if(a==b)
		{
			throw new NumberException("a is equal b");
		}
		else if(a<b)
		{
			throw new NumberException("a is less than b");
		}
		else
			System.out.println("a greater than b");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		 NumberExceptionExample n=new NumberExceptionExample();
		try {
			n.NumberException(a, b);
		}
		catch(NumberException e)
		{
			e.printStackTrace();
		}
		System.out.println("done");
		sc.close();
	}

}
