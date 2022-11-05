/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num_office017_printNumbers
 * @create : 2022/11/5:21:45
 * @info : 剑指 Offer 17. 打印从1到最大的n位数
 **/
public class Num_office017_printNumbers {
    public static int[] printNumbers(int n) {
        int N = (int) (1 * Math.pow(10, n));
        int[] ans = new int[N - 1];
        int index = 0;
        for (int i = 1; i < N; i++) {
            ans[index++] = i;
        }
        return ans;
    }

    public static void main(String[] args) {
        printNumbers(3);
    }
}
