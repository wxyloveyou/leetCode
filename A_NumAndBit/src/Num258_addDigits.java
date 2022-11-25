/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num258_addDigits
 * @create : 2022/11/24:16:19
 * @info : 258. 各位相加
 *
 * X = 100 * a + 10 * b + c
 *   = (99 * a) + (9 * b) + (a + b + c)
 *所以一直对 9 取模
 *
 **/
public class Num258_addDigits {
    public static int addDigits(int num) {
        while (num > 9) {
            num = num % 9;
            if (num == 0) {
                return 9;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int i = addDigits(1233);
        System.out.println(i);
    }
}
