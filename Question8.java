// <aside>
// 💡 You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

// You are given an integer array nums representing the data status of this set after the error.

// Find the number that occurs twice and the number that is missing and return them in the form of an array.

// **Example 1:**
// Input: nums = [1,2,2,4]
// Output: [2,3]

// </aside>


import java.util.Arrays;

    class ErrorNumbersFinder {
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int[] count = new int[nums.length];

        for (int num : nums) {
            count[num - 1]++;
            if (count[num - 1] == 2) {
                result[0] = num;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        System.out.println(Arrays.toString(result));
    }
}
