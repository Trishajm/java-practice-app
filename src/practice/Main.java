package practice;

import practice.arrays.LinearSearch;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==== Java Practice Menu ====");
        System.out.println("1. Run Array Program (Linear Search)");

        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("enter the arry size");
                int n=sc.nextInt();
                int[] arr=new int[n];
                System.out.println("enter elements");
                for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                }
                System.out.println("enter the number to search");
                int key=sc.nextInt();
                LinearSearch.run(arr,key);
                break;


            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}