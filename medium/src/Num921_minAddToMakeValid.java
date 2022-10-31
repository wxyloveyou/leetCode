/**
 * @author : WXY
 * @create : 2022-10-31 22:42
 * @Info : leetCode 921. 使括号有效的最少添加
 */
public class Num921_minAddToMakeValid {
    public static int minAddToMakeValid(String s) {
        char[] str = s.toCharArray();
        int count = 0;
        int need = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '(') {
                count++;
            } else {
                if (count == 0) {
                    need++;
                } else {
                    count--;
                }

            }
        }
        return need + count;
    }
}
