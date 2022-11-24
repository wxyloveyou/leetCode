/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num328_isPowerOfThree
 * @create : 2022/11/21:20:17
 * @info : 328 3 的次幂
 **/
public class Num328_isPowerOfThree {

    public boolean isPowerOfThree(int n) {
        //Math.pow(3,19) = 1162261467
        //整数范围内最大了
        return (n > 0) && (1162261467 % n == 0);
    }

    public static boolean isPowerOfThree1(int n) {
        if ((n != 1 && n % 3 != 0) || (n <= 0)) {
            return false;
        }
        int l = 0 ;
        int r = n ;
        while (l < r) {
            int mid = l + (r - l) / 2;
            long res = (long) Math.pow(3, mid);
            if (res == n) {
                return true;
            } else if (res > n) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

}
