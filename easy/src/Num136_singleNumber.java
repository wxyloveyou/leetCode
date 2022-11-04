/**
 * @program: LeetCode
 * @ClassName Num136_singleNumber
 * @description: 136. 只出现一次的数字
 * @author: wxy
 * @create: 2022-11-04 16:24
 * @Version 1.0
 **/

public class Num136_singleNumber {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 3, 3, 3, 3, 4};
        int ans = singleNumber(arr);
        System.out.println(ans);
    }
}
