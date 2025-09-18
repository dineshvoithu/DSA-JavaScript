
public class Arrayy {
    public static void main(String[] args) {
        int[] nums = { 44, 55, 36, 7, 45, 33 };
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        System.out.println("Max: " + max);
    }
}
