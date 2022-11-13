import java.util.HashSet;
import java.util.Set;

/**
 * leetCode 1704. 判断字符串的两半是否相似
 */
public class Num1704_halvesAreAlike {
    public static boolean halvesAreAlike(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() / 2 && set.contains(s.charAt(i))) {
                count++;
            }
            if (i >= s.length() / 2 && set.contains(s.charAt(i))) {
                count--;
            }
        }
        return count == 0;
    }

    public static void main(String[] args) {
        String str = "book";
        boolean ans = halvesAreAlike(str);
        System.out.println(ans);
    }
}
