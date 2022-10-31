/**
 * @author : WXY
 * @create : 2022-10-30 22:53
 * @Info : leetCode 665. 非递减数列
 */
public class Num665_checkPossibility {
    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] <= nums[i]) {
                continue;
            }
            count++;

            if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                nums[i] = nums[i - 1];
            }else {
                nums[i - 1] = nums[i];
            }
        }
        return count < 2;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,3};
        boolean b = checkPossibility(arr);
        System.out.println(b);
    }
}
