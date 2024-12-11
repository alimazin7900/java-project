package java_programs;

import java.util.Scanner;

public class arrayusingscannerclass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first array limit");
		int a=sc.nextInt();
		System.out.println("enter the first array");
		int[]arr=new int[a];
		for(int i=0;i<=arr.length-1;i++)
		{arr[i]=sc.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		}

	}

