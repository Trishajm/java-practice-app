package practice.loops;
import java.util.Scanner;
public class SumOfEvenNumbers {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 2;i<=num;i+=2)
        {
            sum += i;
        }
        System.out.println("sumof even numbers is: " + sum);
    }
}
