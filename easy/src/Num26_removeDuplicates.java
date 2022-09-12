/**
 * @author : WXY
 * @create : 2022-09-12 21:16
 * @Info : leetCode 26. 删除有序数组中的重复项
 */
public class Num26_removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                nums[++index] = nums[i];
            }
        }
        return index+1;
    }
}
