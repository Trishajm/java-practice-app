package practice.conditionals;
import java.util.Scanner;
public class LargestOfThree {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        System.out.println("enter the Third number");
        int c=sc.nextInt();
        int largest;
        if(a>=b && a>=c)
        {
            largest=a;
        }
        else if(b>=a && b>=c)
        {
            largest=b;
        }
        else
        {
            largest=c;
        }
        System.out.println("the largest number is " +largest);
    }
}