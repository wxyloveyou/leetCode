/**
 * @author : WXY
 * @create : 2022-09-12 19:38
 * @Info : leetCode 69.x的平方根
 */
public class Num69_mySqrt {
    public static int mySqrt_1(int x) {
        return (int) Math.sqrt(x);
    }

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int n  = 1;
        while (x / n >= n) {
            n++;
        }
        return --n;
    }

    public static int mySqrt_2(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int l = 1;
        int r = x / 2;
        while (l <= r) {
            int mid = l + (r - l ) / 2;
            if (mid <= x / mid) {
                l = mid + 1 ;
            } else {
                r = mid - 1;
            }
        }
        return l - 1;
    }

    public static void main(String[] args) {
        int x = 8;
        for (int i = 0; i < 10000; i++) {
            int ans1 = mySqrt(i);
            int ans2 = mySqrt_1(i);
            int ans3 = mySqrt_2(i);
            if (ans1 != ans2 || ans2 != ans3) {
                System.out.println("BUG BUG");
            }
        }
        System.out.println("FINISH");
        System.out.println(mySqrt_2(2147395599));
    }



}
