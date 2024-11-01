package String;

public class bai8 {
    public int myAtoi(String s) {
        int sign = 1;
        long num = 0L;
        int idx = 0;
        // 1.skip space
        while (idx < s.length() && s.charAt(idx) == ' ') {
            idx++;
        }
        if (idx >= s.length())
            return 0;
        // 2.check sign
        if (s.charAt(idx) == '-' || s.charAt(idx) == '+') {
            sign = (s.charAt(idx) == '-') ? -1 : 1;
            idx++;
        }
        // 3.read integer
        while (idx < s.length()) {
            char c = s.charAt(idx);
            if (!Character.isDigit(c)) {
                break;
            }
            num = num * 10 + (c - '0');
            if (num > Integer.MAX_VALUE)
                break;
            idx++;
        }
        // 4. rounding
        if (sign == -1) {
            if (num > (long) Integer.MAX_VALUE + 1)
                return Integer.MIN_VALUE;
            return (int) -num;
        }

        return (int) Math.min(num, Integer.MAX_VALUE);
    }
}
