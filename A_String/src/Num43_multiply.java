/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num43_multiply
 * @create : 2022/11/21:19:24
 * @info : 43. 字符串相乘
 **/
public class Num43_multiply {
    public String multiply(String num1, String num2) {
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
}