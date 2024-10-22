package Array;

import java.util.Arrays;

public class bai238 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        right[n - 1] = 1;
        // n=4
        for (int i = n - 2; i >= 0; i--) {
            // right[3] = 1
            // i = 2 => right[2] = right[3]*nums[3] = 4
            // i = 1 => right[1] = right[2]*nums[2] = 12
            // i = 0 => right[0] = right[1]*nums[1] = 24
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
