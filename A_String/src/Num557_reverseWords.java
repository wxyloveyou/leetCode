/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num557_
 * @create : 2022/11/19:20:05
 * @info : 557. 反转字符串中的单词 III
 **/
public class Num557_reverseWords {
    public  static String reverseWords(String s) {
        char[] ans = s.toCharArray();
        int start = 0;
        int end = 0;
        for (int i = 1; i < s.length(); i++) {
            if (ans[i] == ' ') {
                end = i - 1;
                swap(ans, start, end);
                start = i + 1;
            }
        }
        end = ans.length - 1;
        swap(ans, start, end);
        return new String(ans);
    }

    private static void swap(char[] s, int l, int r) {
        while (l < r) {
            s[r] ^= s[l];
            s[l] ^= s[r];
            s[r] ^= s[l];
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = reverseWords(s);
        System.out.println(s1);
    }
}
