/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num344_reverseString
 * @create : 2022/11/19:17:26
 * @info : 344. 反转字符串
 **/
public class Num344_reverseString {
    public static void reverseString(char[] s) {
        char ch;
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            swap(s, l, r);
            l++;
            r--;
        }
    }

    private static void swap(char[] s, int l, int r) {
        char ch = s[l];
        s[l] = s[r];
        s[r] = ch;
    }
}
