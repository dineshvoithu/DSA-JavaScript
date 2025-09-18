public class Largest {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4 };

        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        System.out.println(max);

    }
}
