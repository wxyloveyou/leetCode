/**
 * @author : WXY
 * @create : 2022-11-01 15:44
 * @Info : leetCode 32. 最长有效括号
 */
public class Num32_longestValidParentheses {
    public static int longestValidParentheses(String s) {
        if (s == null || s.length() < 2) {
            return 0;
        }
        char[] str = s.toCharArray();
        int[] dp = new int[str.length];
        int index = 0;
        int ans = 0;
        for (int i = 1; i < str.length; i++) {
            if (str[i] == ')') {
                index = i - dp[i - 1] - 1;
                if (index >= 0 && str[index] == '(') {
                    dp[i] = dp[i - 1] + 2 + (index > 0 ? dp[index - 1] : 0);
                }
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "(()()";
        int i = longestValidParentheses(s);
        System.out.println(i);
    }
}
