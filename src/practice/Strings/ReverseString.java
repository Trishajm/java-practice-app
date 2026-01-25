package practice.Strings;
import java.util.Scanner;
public class ReverseString {
    public static void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String str=sc.nextLine();
        String reversed="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reversed=reversed + str.charAt(i);
        }
        System.out.println("Reversed string " +reversed);

    }

}
