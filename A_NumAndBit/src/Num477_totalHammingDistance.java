/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num477_totalHammingDistance
 * @create : 2022/11/24:14:02
 * @info : 477. 汉明距离总和
 **/
public class Num477_totalHammingDistance {

    public static int totalHammingDistance(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < 32; i++) {
            int c = 0;
            for (int num : nums) {
                c += (num >> i) & 1;
            }
            ans += (n - c) * c;
        }
        return ans;
    }

    //超时
    public static int totalHammingDistance_1(int[] nums) {
        int len = nums.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                ans += hammingDistance(nums[i], nums[j]);
            }
        }
        return ans;
    }

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
        int[] arr = {4, 14, 2};
        int i = totalHammingDistance(arr);
        System.out.println(i);
    }
}
