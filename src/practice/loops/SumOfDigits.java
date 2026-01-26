package practice.loops;
import java.util.Scanner;

import java.util.Scanner;
public class SumOfDigits {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        System.out.println("Summ of digits  " + sum);
    }

}
