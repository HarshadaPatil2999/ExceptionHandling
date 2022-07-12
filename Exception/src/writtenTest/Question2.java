package writtenTest;

import java.util.Scanner;

public class Question2 {
	
	 void arrayIndex(int a[],int b)
	{
		System.out.println("Array of Index:"+a[b]);
	}
	 void stringIndex(String s)
	 {
		 System.out.println("String length:"+s.length());
	 }
	 void div(int x,int y )
	 {
		 System.out.println("Division:"+(x/y));
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		
		System.out.println("Enter b,x,y");
		int b=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		Question2 q=new Question2();
		
		try {
			
			try {
				
				try {
				  q.arrayIndex(a, b);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("Array index is out of bound..");
//					e.printStackTrace();
				}
				q.div(x, y);
			}
	  catch(ArithmeticException e)
			{
		  System.out.println("We can't divide the number by 0");
			//	e.printStackTrace();
			}
			
			q.stringIndex(null);
		}
		
	catch(NullPointerException e)
		{
		
		System.out.println("String is null...");
			//e.printStackTrace();
		}
		System.out.println("Exception Handling is done");
		sc.close();
		
	}

}
