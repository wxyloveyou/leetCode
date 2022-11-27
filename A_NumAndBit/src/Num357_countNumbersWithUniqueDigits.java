/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num357_countNumbersWithUniqueDigits
 * @create : 2022/11/27:10:53
 * @info : 357. 统计各位数字都不同的数字个数
 **/
public class Num357_countNumbersWithUniqueDigits {
    public static int countNumbersWithUniqueDigits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            int sum = 9;
            int tmp = i;
            while (tmp > 1 ) {
                tmp--;
                sum = sum * (10 - tmp);
            }
            dp[i] = sum + dp[i - 1];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int i = countNumbersWithUniqueDigits(3);
        System.out.println(i);
    }
}
