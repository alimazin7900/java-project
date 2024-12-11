package java_programs;

import java.util.Scanner;

public class duplicateelementsinastring {

	public static void main(String[] args) {
	


int temp=0,i=0;

Scanner sc=new Scanner(System.in);

System.out.println("enter the array limit");

int a=sc.nextInt();

System.out.println("enter the array");

int [] arr=new int[a];

for(i=0;i<=arr.length-1;i++)

{ arr[i]=sc.nextInt();

}

for(i=0;i<=arr.length-1;i++)

{

for(int j=i+1;j<=arr.length-1;j++)

{

if(arr[i]==arr[j])

{

System.out.println("The equal numbers are "+arr[i]);

}

}

}
}
}
