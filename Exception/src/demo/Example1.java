package demo;

import java.util.Scanner;

public class Example1 {
	
	static void add(int a,int b)
	{
		System.out.println("Addition of 2 numbers:"+(a+b));
	}
	static void division(int a,int b)
	{
		System.out.println("Division is processing..");
		System.out.println("Division :"+(a/b));
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
		division(a,b);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			//System.out.println(e);
		}
		add(a,b);
		System.out.println("Exception Handling is done");
		
	}

}
