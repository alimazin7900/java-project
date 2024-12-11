package java_programs;

import java.util.Scanner;

public class evenandoddnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array limit");
		int a=sc.nextInt();
		System.out.println("enter the array");
		int [] arr=new int[a];
		for(int i=0;<=arr.length-1;i++)
		{ arr[i]=sc.nextInt();
		}
		System.out.println("the even numbers are");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
	System.out.println("The odd numbers are");
	for(int i=0;i<=arr.length-1;i++)
	{
		if(arr[i]%2==1)
			System.out.println(arr[i]);
	}
}
			
