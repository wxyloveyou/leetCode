/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num504_convertToBase7
 * @create : 2022/11/21:20:33
 * @info : 504. 七进制数
 **/
public class Num504_convertToBase7 {
    public static String convertToBase7(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        if (num == 0) {
            return "0";
        }
        boolean flag = num < 0;
        num = Math.abs(num);
        while (num != 0) {
            stringBuilder.append(num % 7);
            num /= 7;
        }
        if (flag) {
            stringBuilder.append("-");
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String s = convertToBase7(-7);
        System.out.println(s);
    }

}
