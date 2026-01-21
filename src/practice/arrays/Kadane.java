package practice.arrays;
import java.util.Scanner;
public class Kadane {
    public static void run() {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        System.out.println("enter array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println("maxsum of subarray is "+ maxSum);
    }
}

