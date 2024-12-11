package java_programs;

import java.util.Scanner;

public class arrayreverse {

	public static void main(String[] args) {
     Scanner Sc=new Scanner(System.in);
     System.out.println("enter the array limit");
     int a=Sc.nextInt();
     System.out.println("enter the array ");
     int [] arr=new int[a];
     for(int i=0;i<=arr.length-1;i++)
     {arr[i]=Sc.nextInt();
     }
     System.out.println("reverse of array is");
     int[]arr2=new int[a];
     for(int i=arr.length-1;i>=0;i--)
     {
    	 arr2=arr;
    	 System.out.println(arr[i]);
     }
	}

}
