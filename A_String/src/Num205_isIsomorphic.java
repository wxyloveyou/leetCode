import java.util.HashMap;

/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num205_isIsomorphic
 * @create : 2022/11/18:21:28
 * @info : 205. 同构字符串
 **/
public class Num205_isIsomorphic {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), t.charAt(i));
            }
            if (!map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i), s.charAt(i));
            }
            if (map1.get(s.charAt(i)) != t.charAt(i) || map2.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean ans = isIsomorphic(s, t);
        System.out.println(ans);

    }
}
