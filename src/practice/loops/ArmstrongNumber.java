package practice.loops;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number");
        int num = sc.nextInt();
        int original = num;
        int temp = num;
        int sum = 0;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit,digits);
            temp = temp / 10;
        }
        if (sum == original) {
            System.out.println("It is Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }

}
