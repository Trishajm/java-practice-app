package practice.arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int run()
    {
        int low=0;
        System.out.println("enter the array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int high=arr.length-1;

        System.out.println("enter elements in ascending order");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number to search");
        int key=sc.nextInt();
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==key)
            {
                return mid;
            } else if (arr[mid]<key)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;

    }

}
