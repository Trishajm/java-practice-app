package practice.arrays;
import java.util.Scanner;
public class SecondLargest {
    public static int run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        if(n<2)
        {
            System.out.println("Enter atleast 2 elements");
        }
        int[] arr=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int FirstLarge=Integer.MIN_VALUE;
        int SecondLarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>FirstLarge)
            {
                SecondLarge=FirstLarge;
                FirstLarge=arr[i];
            }
            else if(arr[i]>SecondLarge && arr[i]!=FirstLarge)
            {
                SecondLarge=arr[i];
            }
        }
        if(SecondLarge==Integer.MIN_VALUE)
        {
            return -1;
        }
        return SecondLarge;

    }

}
