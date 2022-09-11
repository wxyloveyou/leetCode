import sun.nio.cs.ext.MacRoman;

/**
 * @author : WXY
 * @create : 2022-09-11 10:52
 * @Info : leetCode 09回文数
 */
public class Num09_isPalindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = x;
        int res = 0;
        while (n != 0) {
            res = res * 10 + n % 10 ;
            n = n / 10;
        }
        return res == x;
    }

    public static void main(String[] args) {
        int x = 123;
        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(-125));
        System.out.println(isPalindrome(125521));
    }
}
