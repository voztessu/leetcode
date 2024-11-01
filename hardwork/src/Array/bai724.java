package Array;

public class bai724 {
    public static int Solution(int[] nums) {
        int sumLeft = 0;
        int sumTotal = 0;
        for (int num : nums) {
            sumTotal += num;
        }
        for (int i = 0; i < nums.length; i++) {
            // 0 = 2 - 0 - 2;
            if (sumLeft == sumTotal - sumLeft - nums[i]) {
                return i;
            } else {
                sumLeft += nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, -1 };
        System.out.println(Solution(nums));
    }
}
