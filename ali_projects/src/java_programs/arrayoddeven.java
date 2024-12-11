package java_programs;

import java.util.Scanner;

public class arrayoddeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array limit");
		int a=sc.nextInt();
		System.out.println("enter the array");
		int[]arr=new int[a];
		for(int i=0;i<=arr.length-1;i++)
		{ arr[i]=sc.nextInt();
		}
		System.out.println("The even position arrays are");
		for(int i=1;i<=arr.length-1;i=i+2)
		{
			System.out.println(arr[i]);
		}
		System.out.println("the odd position arrays are");
		for(int i=0;i<=arr.length-1;i=i+2)
		{
			System.out.println(arr[i]);
		}
		

	}}


