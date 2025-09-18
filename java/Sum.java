// import java.util.Arrays;

// public class Sum {

//     public static void main(String[] args) {
//         int[] nums = { 1, 5, 53 };
//         int sum = Arrays.stream(nums).sum();
//         System.out.println("Sum = " + sum);
//     }
// }

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.lang.model.type.ArrayType;

public class Sum {

    public static void main(String[] args) {

        int[] nums = { 10, 20, 30, 40 };
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = Arrays.stream(nums).sum();
        }
        System.out.println(sum);
    }

}