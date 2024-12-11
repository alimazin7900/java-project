package java_programs;

import java.util.Scanner;

public class ascendingsorting {

	public static void main(String[] args) {
		int temp=0;int i = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array limit");
		int a=sc.nextInt();
		System.out.println("Enter the array ");
		int [] arr=new int[a];
		for(i=0;i<=arr.length-1;i++)
		{arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The ascending of array is");
		for (i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
			System.out.println("The smallest element is"+arr[0]);
			System.out.println("The largest element is" +arr[arr.length-1]);
			
				}
			}
		

	
