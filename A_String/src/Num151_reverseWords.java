

/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num151_reverseWords
 * @create : 2022/11/19:20:35
 * @info : 151. 反转字符串中的单词
 **/
public class Num151_reverseWords {
    public static String reverseWords(String s) {
        char[] str = s.toCharArray();
        int l = 0;
        int r = str.length - 1;

        swapWords(str, l, r);
        swap(str);
       //System.out.println(new String(str));
        return quKonGe(str);
    }

    private static void swap(char[] ans) {
        int start = 0;
        int end = 0;
        for (int i = 1; i < ans.length; i++) {
            if (ans[i] == ' ') {
                end = i - 1;
                swapWords(ans, start, end);
                start = i + 1;
            }
        }
        end = ans.length - 1;
        swapWords(ans, start, end);
    }

    private static String quKonGe(char[] ch) {
        int i = 0;
        int j = 0;
        int n = ch.length;
        while (j < n) {
            while (j < n && ch[j] == ' ') j++;
            while (j < n && ch[j] != ' ') ch[i++] = ch[j++];
            while (j < n && ch[j] == ' ') j++;
            if (j < n) ch[i++] = ' ';
        }
        return new String(ch).substring(0, i);

    }

    private static void swapWords(char[] s, int l, int r) {
        while (l < r) {
            char ch = s[l];
            s[l] = s[r];
            s[r] = ch;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        String s = "  a good   example  ";
        String s1 = reverseWords(s);
        System.out.println(s1);
    }
}
