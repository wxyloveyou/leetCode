/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num461_hammingDistance
 * @create : 2022/11/24:13:53
 * @info :  461. 汉明距离
 *
 **/
public class Num461_hammingDistance {
    public static int hammingDistance(int x, int y) {
        //异或 得到 不同的数位1 ，
        //数有几个1就行
        int num = x ^ y;
        int ans = 0;
        while (num != 0) {
            num = num & (num - 1);
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans = hammingDistance(5, 1);
        System.out.println(ans);
    }
}
