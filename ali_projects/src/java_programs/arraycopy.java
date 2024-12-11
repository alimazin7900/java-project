package java_programs;

import java.util.Scanner;

public class arraycopy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("enter the first array limit");
		int a=sc.nextInt();
		System.out.println("enter the first array");
		int[] arr=new int[a];
		int[] arr2=new int[a];
		for(i=0;i<=arr.length-1;i++)
		{ arr[i]=sc.nextInt();
		}
		for( i=0;i<arr.length-1;i++)
		{ 
			{

			arr2=arr;
		}
		
		for( i=0;i<=arr2.length-1;i++)
		{
			System.out.println(arr2[i]);
		}

	}

	}}
