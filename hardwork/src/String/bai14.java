package String;

public class bai14 {
    public static String isPalindrome(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            boolean ok = true;
            char c = strs[0].charAt(i);
            for (String s : strs) {
                if (s.length() <= i || s.charAt(i) != c) {
                    ok = false;
                    break;
                }
            }
            if (!ok)
                break;
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(isPalindrome(strs));
    }
}
