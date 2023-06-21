
// **Q1.** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// **Example:**
// Input: nums = [2,7,11,15], target = 9
// Output0 [0,1]

// **Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1][

class Find_ind{
    public void ind(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]==target)
            {
                System.out.println(i);
            }
            else{
                for(int j=i+1;j<arr.length;j++)
                {
                    if((arr[i]+arr[j])==target)
                    {
                        System.out.println(i+" "+j);
                    }
                }
            }
        }
    }
}
class Pro1 {
    public static void main(String[] args) {
        Find_ind ob =new Find_ind();
        int arr[]={2,7,11,15};
        int target =9;
        ob.ind(arr,target);
    }
}
