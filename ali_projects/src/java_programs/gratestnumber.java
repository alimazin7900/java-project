package java_programs;

import java.util.Scanner;

public class gratestnumber {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		{
			n=sc.nextInt();
			i=sc.nextInt();
			j=sc.nextInt();
			if(n>i&&n>j)
			{
				System.out.println("the greater number is "+n);
			}
			else if(i>j)
			{
				System.out.println("the greatest number is"+i);
			}
			else
			{System.out.println("the greater number is" +j);
			}
				}

	}

}
