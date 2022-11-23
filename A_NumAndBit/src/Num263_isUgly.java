/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num263_isUgly
 * @create : 2022/11/22:21:35
 * @info : 263. 丑数
 **/
public class Num263_isUgly {
    public static boolean isUgly(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 5 == 0) n /= 5;
        while (n % 3 == 0) n /= 3;
        while (n % 2 == 0) n /= 2;
        return n == 1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            boolean ugly = isUgly(i);
            System.out.println( i + " : " +ugly);

        }
    }
}
