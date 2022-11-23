import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num342_isPowerOfFour
 * @create : 2022/11/21:20:03
 * @info : 342. 4的幂
 **/
public class Num342_isPowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 4 != 0 || n < 0) {
            return false;
        }
        return isPowerOfFour(n / 4);
    }

    public static boolean isPowerOfFour1(int n) {
        return (n > 0) && ((n & (n - 1)) == 0) && (n % 3 == 1);
    }
    public boolean isPowerOfFour2(int n) {
        // 4的幂一定是2的幂，并且是2的偶数次幂，  数学归纳法可知：2的偶数次幂mod3==1，2的奇数次幂mod3==2
        return (n > 0) && ((n & (n - 1)) == 0) && (n % 3 == 1);
    }

    public static void main(String[] args) {
        boolean powerOfFour = isPowerOfFour1(16);
        System.out.println(powerOfFour);

    }
}
