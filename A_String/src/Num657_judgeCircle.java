/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num657_judgeCircle
 * @create : 2022/11/20:16:40
 * @info :  657. 机器人能否返回原点
 **/
public class Num657_judgeCircle {
    public static boolean judgeCircle(String moves) {
        int[] arr = new int[2];
        //0  表 L+ R-  1 表 U+ D-
        char[] str = moves.toCharArray();
        for (int i = 0; i < str.length; i++) {
            switch (str[i]) {
                case 'L': arr[0]++;break;
                case 'R': arr[0]--;break;
                case 'U': arr[1]++;break;
                case 'D': arr[1]--;break;
            }
        }
        return arr[0] == 0 && arr[1] == 0 ? true : false;
    }
}
