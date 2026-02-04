package practice.loops;
import java.util.Scanner;
public class PrimeNumber {
    public static void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        if(num<=1) {
            System.out.println("not prime");
            return;
        }
        boolean isPrime;
        isPrime = true;
        for(int i=2;i<=num/2;i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
            if(isPrime) System.out.println("number is prime");
            else System.out.println("not a prime");

    }

}
