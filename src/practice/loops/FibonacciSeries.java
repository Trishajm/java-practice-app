package practice.loops;
import java.util.Scanner;
public class FibonacciSeries {
    public static void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n=sc.nextInt();
        int first=0;
        int second=1;
        System.out.println("Fibonacci series: ");
        for(int i=1;i<=n;i++)
        {
            System.out.println(first+" ");
            int next=first+second;
            first=second;
            second=next;
        }
        System.out.println();

    }
}
