class L {
    public void Do(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest; // old largest becomes second largest
                largest = num; // new largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num; // update second largest
            }
        }

    }
}

public class SecondLarge {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 40, 430 };
        L obj = new L();
        obj.Do(nums);

    }
}
