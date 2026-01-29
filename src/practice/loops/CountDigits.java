package practice.loops;
import java.util.Scanner;
public class CountDigits {
    public static void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int temp=num;
        int count =0;
        if(temp==0)
            count=1;
        while(temp!=0)
        {
            count++;
            temp=temp/10;
        }
        System.out.println("Total number of digits is " + count);
    }

}
