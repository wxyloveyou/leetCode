/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num_
 * @create : 2022/11/10:21:15
 * @info : 520. 检测大写字母
 **/
public class Num520_detectCapitalUse {
    public static boolean detectCapitalUse(String word) {
        int N = word.length();
        int up = 0;
        int low = 0;
        for (int i = 0; i < N; i++) {
            if (word.charAt(i) <= 'Z' && word.charAt(i) >= 'A') {
                up++;
            }else {
                low++;
            }
        }
        if (up == N || low == N) {
            return true;
        } else if (up == 1 && (word.charAt(0) <= 'Z' && word.charAt(0) >= 'A')) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("FFFf"));
    }
}
