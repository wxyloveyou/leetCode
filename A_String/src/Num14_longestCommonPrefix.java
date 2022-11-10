import java.util.Arrays;

/**
 * @author : WXY
 * @create : 2022-09-12 21:43
 * @Info : leetcode 14. 最长公共前缀
 */
public class Num14_longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, 0, strs.length);
        String ans = "";
        String head = strs[0];
        String tail = strs[strs.length - 1];
        for (int i = 0; i < tail.length() && i < head.length(); i++) {
            if (tail.charAt(i) == head.charAt(i)) {
                ans += head.charAt(i);
            } else {
                break;
            }
        }
        return String.valueOf(ans);
    }

    public static void main(String[] args) {
        String[] str = {"asdf", "adf", "adsa"};
        System.out.println(longestCommonPrefix(str));
        String s = "sadfj";
        s += 'a';
        System.out.println(s);
    }
}
