package practice;

import practice.arrays.LinearSearch;
import practice.arrays.MinMax;
import practice.arrays.Kadane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==== Java Practice Menu ====");
        System.out.println("1. Run Array Program (Linear Search)");
        System.out.println("2. Run Array program(MinMax)");
        System.out.println("3.Run Array program(Kadane)");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                LinearSearch.run();
                break;
            case 2:
                MinMax.run();
                break;
            case 3:
                Kadane.run();
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}