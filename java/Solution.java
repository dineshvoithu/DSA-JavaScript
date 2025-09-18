
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }

            }

        }
        return new int[] {};

    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 6;
        int[] result = obj.twoSum(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

}