package practice.arrays;

import java.util.Scanner;

public class LinearSearch {
    public  static void run(int[] arr,int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("key is found at index " + i);
                return;
            }
        }
        System.out.println("notfound");
    }
}
