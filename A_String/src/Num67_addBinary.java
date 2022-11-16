/**
 * @p11+9rogram: LeetCode
 * @ClassName Num67_addBinary
 * @description: LeetCode : 67. 二进制求和
 * @author: WXY
 * @create: 2022-11-14 17:15
 * @Version 1.0
 **/

public class Num67_addBinary {
    public static String addBinary(String a, String b) {
        if(a == null || a.length() == 0) return b;
        if(b == null || b.length() == 0) return a;
        int i = a.length() - 1;
        int j = b.length() - 1;
        int c = 0; // 进位
        StringBuilder stb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                c += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                c += b.charAt(j--) - '0';
            }
            stb.append(c % 2);
            c >>= 1;
        }
        String s = stb.reverse().toString();
        return c > 0 ? '1' + s : s;
    }


    public static void main(String[] args) {
        String b = "110";
        String a = "011";
        String str = addBinary(a, b);
        System.out.println("结 果 ：" + str);

    }
}