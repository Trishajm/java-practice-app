package practice.arrays;

import java.util.Scanner;

public class EvenOdd {
    public static void run() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements");
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
            System.out.println("even number count " + evenCount);
            System.out.println("odd number Count " + oddCount);
        }
    }
