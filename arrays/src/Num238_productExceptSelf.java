/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num238_
 * @create : 2022/11/7:17:20
 * @info : 238. 除自身以外数组的乘积
 **/
public class Num238_productExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 1;
        for (int i = 0; i < n; i++) {
            res[i] = left;
            left = left * nums[i];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * right;
            right = right * nums[i];
        }
        return res;
    }
}
