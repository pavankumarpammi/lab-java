import java.util.Arrays;
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i++)
//         {
//             if(nums[i]==nums[i+1])
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
//  }
// class Sol{
// public void merge(int[] nums1, int m, int[] nums2, int n) {
//     int i = m - 1;
//     int j = n - 1;
//     int k = m + n - 1;
//     while (j >= 0)
//       if (i >= 0 && nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
//       else nums1[k--] = nums2[j--];
//   }}
// class Que5{
//     public static void main(String[] args) {
        
//         int nums1[]={1,2,3,0,0,0};
//         int m =3;
//         int nums2[]={2,5,6};
//         int n=3;
//         Sol ob =new Sol();
//         ob.merge(nums1,m,nums2,n);
//         for(int i:nums1)
//         {
//             System.out.print(i+" ");
//         }
//     }
//  }
import java.util.Arrays;
class Sol {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); 
        for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i+1]) {
                    return true;
                }
        }
        return false;
    }
}
class Que5{
    public static void main(String[] args) {
        
        int nums1[]={1,2,3,1};
        Sol ob =new Sol();
        
        System.out.println(ob.containsDuplicate(nums1));
    }
 }