/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num693_hasAlternatingBits
 * @create : 2022/11/24:15:38
 * @info : leetCode 693题
 * 判断一个数的二进制是不是1、0相隔的形式。
 * 比如 5 -> 101  true;
 *     6 -> 110  false;
 **/
public class Num693_hasAlternatingBits {

    public static boolean hasAlternatingBits(int n) {
        int temp = n >> 1;
//        int res = (temp ^ n);
        return ((temp ^ n) & ((temp ^ n) + 1) ) == 0;
    }

    public static void main(String[] args) {
        boolean b = hasAlternatingBits(5);
        System.out.println(b);
    }
}
