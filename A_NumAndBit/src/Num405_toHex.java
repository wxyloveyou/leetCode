/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num405_
 * @create : 2022/11/27:11:28
 * @info : 405. 数字转换为十六进制数
 **/
public class Num405_toHex {
    public static String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder stringBuilder = new StringBuilder();
        while (num != 0) {
            stringBuilder.append(map[num & 0xf]);
            num = num >>> 4;
        }
        return stringBuilder.reverse().toString();
    }


    public static String toHex1(int num) {

        return Integer.toHexString(num);
    }
    public static void main(String[] args) {
        System.out.println(16 & 15);
        System.out.println(16>>>4);
        System.out.println(toHex(-1));
    }
}
