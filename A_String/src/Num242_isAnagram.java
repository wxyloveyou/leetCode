/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num242_isAnagram
 * @create : 2022/11/20:15:50
 * @info : 242. 有效的字母异位词
 **/
public class Num242_isAnagram {
    public static boolean isAnagram(String s, String t) {
        int ans = 0;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) -  'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) -  'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
