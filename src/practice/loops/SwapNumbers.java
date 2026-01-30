package practice.loops;
import java.util.Scanner;
public class SwapNumbers {
    public static void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int a=sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();
        System.out.println("before swapping "+"a="+ a+" ," +"b= " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping "+ "a =" + a+ " ,"+ "b =" + b);

    }

}
