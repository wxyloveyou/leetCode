/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num28_strStr
 * @create : 2022/11/21:18:51
 * @info : 28. 找出字符串中第一个匹配项的下标
 *       KMP算法
 **/
public class Num28_strStr {
    public int strStr(String s, String m) {
        if (s == null || m == null || m.length() < 1 || s.length() < m.length()) {
            return -1;
        }
        char[] str = s.toCharArray();
        char[] match = m.toCharArray();
        int x = 0;//str中当前比对到的位置
        int y= 0;//match中当前比对到的位置
        // M  M <= N  O(n)
        int[] next = getNextArray(match);
        //O(N)
        while (x < str.length && y < match.length) {
            if (str[x] == match[y]) {
                x++;
                y++;
            } else if (y == 0) {//next[y] == -1
                x++;
            } else {
                y = next[y];
            }
        }
        return y == match.length ? x - y : -1;
    }

    //M O(M)
    private static int[] getNextArray(char[] match) {
        if (match.length == 1) {
            return new int[]{-1};
        }
        int[] next = new int[match.length];
        next[0] = -1;
        next[1] = 0;
        int i = 2;
        //cn代表 ，cn位置的字符，是当前和i-1位置比较的字符
        //cn代表从哪个位置往前跳，  指i-1位置的信息
        int cn = 0;
        while (i < match.length) {
            if (match[i - 1] == match[cn]) { // 跳出来的时候
                next[i++] = ++cn;
//                next[i] = cn + 1;
//                i++;
//                cn++;
            } else if (cn > 0) {
                cn = next[cn];
            }else {
                next[i++] = 0;
            }
        }
        return next;
    }

}
