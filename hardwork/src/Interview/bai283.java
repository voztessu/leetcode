package Interview;

import java.util.Arrays;

public class bai283 {
    public static int[] Solution(int[] nums) {
        // Di chuyển kh phải 0 lên trước
        int indexNonZero = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[indexNonZero] = nums[i];
                indexNonZero++;
            }
        }
        // Còn lại là 0;
        for (int i = indexNonZero; i < n; i++) {
            nums[indexNonZero] = 0;
            indexNonZero++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        String format = Arrays.toString(Solution(nums));
        System.out.println(format);
    }
}
