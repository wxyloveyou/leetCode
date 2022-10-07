import javax.xml.ws.Endpoint;

/**
 * @author : WXY
 * @create : 2022-10-07 20:35
 * @Info : leetcode 70. 爬楼梯
 */
public class Num70_climbStairs {
    public static int climbStairs_1(int n){
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs_1(n - 1) + climbStairs_1(n - 2);
    }

    public static int climbStairs(int n) {
        int[] dp = new int[50];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < 50; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 30;
        int num1 = climbStairs_1(n);
        int num2 = climbStairs(n);
        System.out.println(num1);
        System.out.println(num2);
    }
}
