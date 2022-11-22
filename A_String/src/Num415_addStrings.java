import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num415_addStrings
 * @create : 2022/11/21:19:06
 * @info : 415. 字符串相加
 **/
public class Num415_addStrings {
    public static String addStrings(String num1, String num2) {
        String ans = "";
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        char[] str1 = num1.toCharArray();
        char[] str2 = num2.toCharArray();
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry += str1[i--] - '0';
            }
            if (j >= 0) {
                carry += str2[j--] - '0';
            }
            ans = ans + (carry % 10);
            carry /= 10;
        }
        return reverseString(ans.toCharArray());
    }
    public static String reverseString(char[] s) {
        char ch;
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            swap(s, l, r);
            l++;
            r--;
        }
        return new String(s);
    }

    private static void swap(char[] s, int l, int r) {
        char ch = s[l];
        s[l] = s[r];
        s[r] = ch;
    }



    public static String addStrings1(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry += num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += num2.charAt(j--) - '0';
            }
           sb.append(carry % 10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "121";
        String s2 = "13";
        String s = addStrings(s1, s2);
        System.out.println(s);
    }
}
