package Array;

public class bai122 {
    public static int findMax(int[] prices) {
        int res = 0;
        int res2 = 0;
        for (int i = 1; i < prices.length; i++) {
            res = prices[i] - prices[i - 1];
            if (res > 0) {
                res2 += res;
            }
        }
        return res2;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 6, 4, 3, 1 };
        System.out.println(findMax(prices));
    }
}
