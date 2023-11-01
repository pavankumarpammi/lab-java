import java.util.*;

public class PrefixSum2D {
    public static int sum=0;
    public static void RowWiseSum(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                   //arr[i]= arr[i]+arr[i-1]
                   arr[i][j]=arr[i][j]+arr[i][j-1];
            }
        }
    }
    public static void ColWiseSum(int arr[][])
    {
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                   //arr[i]= arr[i]+arr[i-1]
                   arr[i][j]=arr[i][j]+arr[i-1][j];
            }
        }
    }
    public static void printArray(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
    public static int PrefixSum(int arr[][],int r1,int c1,int r2,int c2)
    {
        for(int i=r1;i<=r2;i++)
        {
            for(int j=c1;j<=c2;j++)
            {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static int SumRes(int arr[][],int r1,int c1,int r2,int c2)
    {
        int up=0,left=0,common_region=0,sum=0;
        sum=arr[r2][c2];
        up=arr[r1-1][c2];
        left=arr[r2][c1-1];
        common_region=arr[r1-1][c1-1];
        int result =sum-up-left+common_region;
        return result;
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int arr[][] ={
                    {1,1,1,1},
                    {1,1,1,1},
                    {1,1,1,1},
                    {1,1,1,1}};
        System.out.println("Enter row 1 & column 1 and row2 & column2:");
        int r1 = ob.nextInt();
        int c1 = ob.nextInt();
        int r2 = ob.nextInt();
        int c2 = ob.nextInt();
        ob.close();
        // int result = PrefixSum(arr,r1,c1,r2,c2);
        // System.out.println(result);
        RowWiseSum(arr);
        printArray(arr);
        System.out.println();
        ColWiseSum(arr);
        printArray(arr);
        System.out.println();
        int res =SumRes(arr,r1,c1,r2,c2);
        System.out.println(res);


    }
}
