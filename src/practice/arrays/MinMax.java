package practice.arrays;
import java.util.Scanner;
public class MinMax {
    public static void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;            //can also use int max,min=arr[0]
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("minimun value "+ min);
        System.out.println("maximum value "+ max);
    }
}
