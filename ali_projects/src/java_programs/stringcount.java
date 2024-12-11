package java_programs;

import java.util.Scanner;

public class stringcount {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter a string");
		String s=sc.nextLine();
		int i;
		int c=0;
		for(  i=0;i<s.length();i++)
		{
	
			if(s.charAt(i) !=' ')
			{
				c++;
			}
		}
		System.out.println(c);
			}
		
	

}

