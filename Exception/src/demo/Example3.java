package demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
	
	
	
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
		System.out.println("Index of element:"+arr[c]);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		
		
//		int a=0;
//		int b=0;
		 System.out.println("EnterIndex ");
			int c=sc.nextInt();
			System.out.println("Enter int a and int b");
			 
		
		
		try 
		
		{   int a=sc.nextInt();
		  int   b=sc.nextInt();
			add(a,b);
		     div(a,b);
		     
		}
		catch(ArithmeticException|InputMismatchException|ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			//e.printStackTrace();
		}
		
		index(arr,c);
		
		System.out.println("Exception Handling done");
	}

}
