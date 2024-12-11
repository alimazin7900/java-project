package java_programs;

import java.util.Scanner;

public class multiplicationandsum {

	public static void main(String[] args) {
	int sum=0,mul=1;
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the array limit");
	int a=Sc.nextInt();
	System.out.println("enter the array");
	int []arr=new int[a];
	for(int i=0;i<=arr.length-1;i++)
	{arr[i]=Sc.nextInt();
	}
	System.out.println("the sum of numbers are");
	for(int i=0;i<=arr.length-1;i++)
	{
		sum=sum+arr[i];
		
	}
	System.out.println(sum);
	System.out.println("The multiplication of numbers are"); 
	for(int i=0;i<=arr.length-1;i++)
	{
		mul=mul*arr[i];
	}
	System.out.println(mul);
	}
	
	}


