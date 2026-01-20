package practice.arrays;

import java.util.Scanner;

public class LinearSearch {
    public  static void run() {
        System.out.println("enter the array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number to search");
        int key=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("key is found at index " + i);
                return;
            }
        }
        System.out.println("notfound");
    }
}
