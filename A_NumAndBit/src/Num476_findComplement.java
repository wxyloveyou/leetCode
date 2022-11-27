/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num476_findComplement
 * @create : 2022/11/24:13:20
 * @info : 476. 数字的补数
 *
 * 取反只需要与 全 1 异或 即可
 *
 **/
public class Num476_findComplement {
    public static int findComplement(int num) {
        int n = num;
        int height = 1;
        while (n != 0) {
            height = n & (-n);
            n = n & (n - 1);
        }
        return ((height << 1) - 1) ^ num;
//        return (((Integer.highestOneBit(num)<<1))-1) ^ num;
    }

    public static void main(String[] args) {
        int complement = findComplement(1);
        System.out.println(complement);
    }
}
