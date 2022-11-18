/**
 * @author : WXY
 * @program : LeetCode 191. 位1的个数
 * @className ：Num191_hammingWeight
 * @create : 2022/11/18:20:57
 * @info :
 **/
public class Num191_hammingWeight {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(000100000001));

    }
}
