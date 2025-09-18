public class Min {
    public static void main(String[] args) {
        int[] nums = { 33, 44, 2, 55 };
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);

        }
        System.out.println(min);

    }
}
