package Recursion;

import java.util.HashSet;
import java.util.Set;

public class bai202 {
    static Set<Integer> set = new HashSet<>();

    public static boolean isHappy(int n) {
        if (n == 1)
            return true;
        if (set.contains(n))
            return false;
        set.add(n);
        return isHappy(compute(n));
    }

    private static int compute(int n) {
        int sum = 0;
        while (n > 0) {
            int k = n % 10;
            sum += k * k;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
