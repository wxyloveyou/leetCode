/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num434_
 * @create : 2022/11/10:21:35
 * @info : 434. 字符串中的单词数
 **/
public class Num434_countSegments {
    public static int countSegments(String s) {
        int count = 0;
        for (String str : s.split(" ")) {
            if (!"".equals(str)) {
                count++;
            }
        }
        return count;
    }

    public static int countSegments1(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((i == 0 || str.charAt(i - 1) == ' ') && str.charAt(i) != ' ') {
                ans++;
            }
        }
        return ans;
    }
}
