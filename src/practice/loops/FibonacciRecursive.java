package practice.loops;
import java.util.Scanner;
public class FibonacciRecursive {
    public static int fib(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fib(n-1)+fib(n-2);
    }

    public static void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(fib(i)+ " ");
        }
        System.out.println();
    }
}
