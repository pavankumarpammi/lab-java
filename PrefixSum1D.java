import java.util.*;
public class PrefixSum1D {
    public static void main(String[] args) {
       // int arr[]={2,4,5,7};
        Scanner ob =new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter an array Elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        int inital =0;
        System.out.println("The output:");
        for(int i=0;i<arr.length;i++)
        {
            if(i>0)
            {

                inital++;
                int sum = arr[i-1]+arr[i];
                arr[inital]=sum;
            }
            System.out.println(arr[i]);
        }
        ob.close();
    }
}
