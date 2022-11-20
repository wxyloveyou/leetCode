import java.util.HashMap;
import java.util.HashSet;

/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num387_firstUniqChar
 * @create : 2022/11/20:15:17
 * @info : 387. 字符串中的第一个唯一字符
 **/
public class Num387_firstUniqChar {
    public static int firstUniqChar(String s) {
        char[] str = s.toCharArray();
        int[] arr = new int[26];
        for (int i = 0; i < str.length; i++) {
            arr[str[i] - 'a']++;
        }
        for (int i = 0; i < str.length; i++) {
            if (arr[str[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
