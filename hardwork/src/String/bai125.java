package String;

public class bai125 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isValid(c)) {
                sb.append(toLowerCase(c));
            }
        }
        return isPali(sb.toString());
    }

    private boolean isValid(char c) {
        return Character.isLetterOrDigit(c);
    }

    private boolean isPali(String a) {
        int left = 0;
        int right = a.length() - 1;
        while (left < right) {
            if (a.charAt(left) != a.charAt(right))
                return false;
            right--;
            left++;
        }
        return true;
    }

    private char toLowerCase(char c) {
        return Character.toLowerCase(c);
    }

    public static void main(String[] args) {
        bai125 a = new bai125();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(a.isPalindrome(s));
    }
}