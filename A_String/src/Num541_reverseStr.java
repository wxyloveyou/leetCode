/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num541_reverseStr
 * @create : 2022/11/19:17:30
 * @info : 541. 反转字符串 II
 **/
public class Num541_reverseStr {
    public static String reverseStr(String str, int k) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i += 2 * k) {
            int start = i;
            int end = Math.min(str.length() - 1, start + k - 1);
            while (start < end) {
                swap(ch, start, end);
                start++;
                end--;
            }
        }
        return new String(ch);
    }
    private static void swap(char[] s, int l, int r) {
        char ch = s[l];
        s[l] = s[r];
        s[r] = ch;
    }

    public static void main(String[] args) {
        String str = "a";
        String s = reverseStr(str, 2);
        System.out.println(s);

    }
}
