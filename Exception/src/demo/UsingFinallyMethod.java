package demo;

import java.util.Scanner;

public class UsingFinallyMethod {
	
	static void add(int a,int b)
	{
		System.out.println("Addition:"+(a+b));
	}
	static void  div(int a,int b)
	{
		System.out.println("Division:"+(a/b));
	}
	static void index(int arr[],int c)
	{
		System.out.println("Index of Array element:"+arr[c]);
	}
	static void string(String s1,int d)
	{
		System.out.println("Index of String element:"+s1.charAt(d));
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		String s1="Java";
		System.out.println("Enter int a and int b");
		 
		int a=sc.nextInt();
	    int b=sc.nextInt();
		System.out.println("Enter Index of Array ");
		int c=sc.nextInt();
		System.out.println("Enter Index of String");
		int d=sc.nextInt();
			
		
		try 
		
		{   
			
		     div(a,b);
		     index(arr,c);
		     string(s1,d);
		}
//		catch(ArithmeticException|InputMismatchException|ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e);
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		finally//try method is either with catch block or with try finally block.
		{
			
			System.out.println("finally block is always executes either exception is occur or nor ");
			sc.close();
		}
		add(a,b);
		System.out.println("Exception Handling done");
		
	}

}
