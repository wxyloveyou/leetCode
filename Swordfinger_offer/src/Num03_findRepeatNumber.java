/**
 * leetCode :
 * 剑指offer： 03 数组中重复的数字
 */
public class Num03_findRepeatNumber {
    public static int findRepeatNumber(int[] nums) {
        int[] ans = new int[nums.length];
        int num = nums[0];
        for (int i = 0; i < nums.length; i++) {
            ans[nums[i]]++;
            if (ans[nums[i]] > 1) return nums[i];
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 21, 5, 2, 85, 1, 4, 1, 1, 4};
        int repeatNumber = findRepeatNumber(arr);
        System.out.println(repeatNumber);
    }
}
