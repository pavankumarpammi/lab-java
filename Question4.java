import java.util.Arrays;
class Solution {
    public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
    }
}
class Question4{
    public static void main(String[] args) {
        Solution ob =new Solution();
        int arr[] ={1,2,3};
        int res[] = ob.plusOne(arr);
        System.out.println( Arrays.toString(res));
        
    }
}