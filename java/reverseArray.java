
class Solution {
    public void reverseArrayy(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;

        }
    }
}

public class reverseArray {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = { 1, 2, 3, 4, 5 };

        obj.reverseArrayy(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}
