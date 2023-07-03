
// 💡  Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

// Note that you must do this in-place without making a copy of the array.

// **Example 1:**
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]


class Question6 {
    public void order(int arr[])
    {
        int k=arr.length - 1;
        for(int i=0;i<arr.length-1;i++)
        {   
            // if(arr[i]==0)
            // {
            //     arr[k--]=0;
            // }
            if(arr[i]>arr[i+1])
            {
                int temp=0;
                temp =arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        Question6 ob =new Question6();
        ob.order(nums);
        for(int i:nums)
        {
            System.out.print(i+" ");
        }
    }
}

