package java_programs;

import java.util.Scanner;

public class stringconcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the strings to be concatenated");
			String s=sc.nextLine();
			String p=sc.nextLine();
			System.out.println(s+p);
			System.out.println(s.concat(p));
			System.out.println(s.toUpperCase());
			System.out.println(p.toLowerCase());
		}
	}

}
