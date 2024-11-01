package Array;

import java.util.ArrayList;
import java.util.List;

public class bai448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> missList = new ArrayList<>();
        int n = nums.length;
        for (int num : nums) {
            list.add(num);
        }
        for (int i = 1; i < n; i++) {
            if (!list.contains(i)) {
                missList.add(i);
            }
        }
        return missList;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDisappearedNumbers(nums));
    }
}
