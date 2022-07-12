package demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example4 {
	
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
		 System.out.println("Index of String Element:"+s1.charAt(d));
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          int arr[]= {1,2,3,4,5};
          String s1="Java";
         System.out.println("Enter int a and int b");
       int   a=sc.nextInt();
		int	 b=sc.nextInt();
		System.out.println("Enter Index of Array ");
		int c=sc.nextInt();
		System.out.println("EnterIndex of String ");
		int d=sc.nextInt();
		
		
		try {
			  
		    try {
			
			   try{
				
				   try
				    {
					string(s1,d);
				    }
				  catch(StringIndexOutOfBoundsException e)
				   {
					System.out.println(e);
				   }
				   
			       index(arr,c);
			    }
			   
		     catch(ArrayIndexOutOfBoundsException e)
			  {
				System.out.println(e);
			  }
			 
			 div(a,b);
		 }
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
   catch(Exception e)
	{
	  System.out.println(e);
	}
		
		add(a,b);
		System.out.println("Exception Handling done");
		
	}

}
