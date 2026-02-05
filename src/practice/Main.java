package practice;

import practice.arrays.LinearSearch;
import practice.arrays.MinMax;
import practice.arrays.Kadane;
import practice.arrays.BinarySearch;
import practice.arrays.EvenOdd;
import practice.arrays.SecondLargest;
import practice.Strings.ReverseString;
import practice.loops.*;
import practice.Strings.CountVowels;
import practice.loops.SumOfEvenNumbers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==== Java Practice Menu ====");
        System.out.println("1. Run Array Program (Linear Search)");
        System.out.println("2. Run Array program(MinMax)");
        System.out.println("3.Run Array program(Kadane)");
        System.out.println("4.Run Array program(BinarySearch)");
        System.out.println("5. Run Array program(EvenOdd)");
        System.out.println("6. Run Array program(SecondLargest)");
        System.out.println("7. Run String program(ReverseString)");
        System.out.println("8. Run loops program(SumOfDigits)");
        System.out.println("9. Run loops program(Palindrome)");
        System.out.println("10. Run loops program(ArmstrongNumber)");
        System.out.println("11. Run loops program(CountDigits)");
        System.out.println("12. Run loops program(SwapNumbers)");
        System.out.println("13. Run Strings program(CountVowels)");
        System.out.println("14. Run loops program(FibonacciSeries)");
        System.out.println("15. Run the loops program(FIbonacciRecursive)");
        System.out.println("16`. Run the loops program(PrimeNumber)");
        System.out.println("17. Run the loops program(SumOfEvenNumbers)");
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
            case 4:
                int result=BinarySearch.run();
                if(result==-1)
                {
                    System.out.println("element not found");
                }
                else{
                    System.out.println("Element found at index " + result);
                }
                break;
            case 5:
                EvenOdd.run();
                break;
            case 6:
                int second=SecondLargest.run();
                if(second==-1)
                {
                    System.out.println("Second largest not found");
                }
                else
                {
                    System.out.println("Second largest element is "+ second);
                }
                break;
            case 7:
                ReverseString.run();
                break;
            case 8:
                SumOfDigits.run();
                break;
            case 9:
                Palindrome.run();
                break;
            case 10:
                ArmstrongNumber.run();
                break;
            case 11:
                CountDigits.run();
                break;
            case 12:
                SwapNumbers.run();
                break;
            case 13:
                CountVowels.run();
                break;
            case 14:
                FibonacciSeries.run();
                break;
            case 15:
                FibonacciRecursive.run();
                break;
            case 16:
                PrimeNumber.run();
                break;
            case 17:
                SumOfEvenNumbers.run();
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}