package java_programs;

import java.util.Scanner;

public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			
			rev=rev+s.charAt(i);
		}
		System.out.println("the reverse of string is"+rev);
	
		}
			

	}


