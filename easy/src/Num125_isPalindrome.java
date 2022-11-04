import java.net.SocketTimeoutException;

/**
 * @program: LeetCode
 * @ClassName Num125_isPalindrome
 * @description: LeetCode : 125. 验证回文串
 * @author: WXY
 * @create: 2022-11-04 17:02
 * @Version 1.0
 **/

public class Num125_isPalindrome {
    public static boolean isPalindrome(String s) {
        String newstr = s.replaceAll("[^0-9a-zA-Z]", "");
        newstr = newstr.toLowerCase();
        char[] str = newstr.toCharArray();
        int start = 0;
        int end = str.length - 1;
        while (start <= end) {
            if (str[start++] != str[end--]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean ans = isPalindrome1(str);
        System.out.println(ans);
    }
    public static boolean isPalindrome1(String str) {

        char[] s = str.toCharArray();
        for (int i =0; i < s.length; i++)
        {
            if (s[i] >= 'A' && s[i] <= 'Z')
            {
                s[i] += 32;
            }
        }
        String string = "";
        for (int i = 0; i < s.length; i++)
        {
            if ((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= '0' && s[i] <= '9'))
            {
                string += s[i];
            }
        }
        System.out.println(string);
        char[] chars = string.toCharArray();
        int front = 0;
        int end = chars.length-1;
        while (front <= end) {
            if (chars[front++] != chars[end--]) {
                return false;
            }
        }
        return true;
    }
}
