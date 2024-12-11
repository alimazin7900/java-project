package java_programs;

import java.util.Scanner;

public class arrayoddeven1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	       
        System.out.println("Enter the array limit:");
        int a = sc.nextInt();

     
        System.out.println("Enter the array elements:");
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

       
        System.out.println("The even numbers are:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

       
        System.out.println("The odd numbers are:");
        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }

	}

