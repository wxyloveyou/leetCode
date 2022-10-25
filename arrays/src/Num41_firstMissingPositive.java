import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author : WXY
 * @create : 2022-10-25 20:05
 * @Info : LeetCode 41.缺失的第一个正数
 *
 */
public class Num41_firstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while (nums[i] > 0 && nums[i] <= len && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return len + 1;
    }


    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }
}
