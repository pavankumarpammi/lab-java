import java.util.*;

class SOl{
    public static void RotationArray(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr[0].length;j++)
            {
                int temp =arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
       // System.out.println(arr.length);
       
        

        RotationArray(arr);
        for(int i=0;i<arr.length;i++)
        {
            int li =0;
            int ri =arr.length-1;
            while(li<ri){
                int temp = arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;
            }
        }
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr[i].length;j++)
        //     {
        //        System.out.print(arr[i][j]+" ");
            
        //     }
        //     System.out.println();
        // }
        for(var mat:arr)
        {
            System.out.println(Arrays.toString(mat));
        }
    }
}