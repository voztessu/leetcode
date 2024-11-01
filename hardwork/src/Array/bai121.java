package Array;

public class bai121 {
    public static int Solution(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 1, 5, 3, 6, 4 };
        System.out.println(Solution(nums));
    }
}
