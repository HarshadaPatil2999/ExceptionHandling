package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Example2 {
	
	static void index( int arr[],int a)
	{
		System.out.println("Index of element:"+arr[a]);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,4,6,8,9};
		System.out.println("Enter any index of element in Array");
		int a=sc.nextInt();
		System.out.println(Arrays.toString(arr));
		try {
		index(arr,a);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			e.printStackTrace();
		}
		System.out.println("Exception done");
		
	}

}
