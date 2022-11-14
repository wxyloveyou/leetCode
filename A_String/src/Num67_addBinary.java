import com.sun.org.apache.xml.internal.dtm.ref.DTMAxisIterNodeList;

import java.io.InputStream;

/**
 * @program: LeetCode
 * @ClassName Num67_addBinary
 * @description: LeetCode : 67. 二进制求和
 * @author: WXY
 * @create: 2022-11-14 17:15
 * @Version 1.0
 **/

public class Num67_addBinary {
    public static String addBinary(String a, String b) {

        int aNum = conserve(a);
        int bNum = conserve(b);
        int count = aNum + bNum;
//        int aNum = Integer.parseInt(a);
//        int bNum = Integer.parseInt(b);

        System.out.println(count);
        return "";
    }

    private static int conserve(String a) {
        char[] asrt = a.toCharArray();
        int aNum = 0;
        for (int i = asrt.length - 1; i >= 0; i--) {
            if (asrt[i] == '1') {
                aNum =  aNum + (int) (Math.pow(2, asrt.length - i - 1));
            }
        }
        return aNum;
    }

    public static void main(String[] args) {
        addBinary("011", "010");
    }
}