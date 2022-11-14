/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num283_moveZeroes
 * @create : 2022/11/6:17:06
 * @info : 283. 移动零
 **/
public class Num283_moveZeroes {
    public static void moveZeroes(int[] nums) {
        int N = nums.length;
        int index = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] != 0) {
                swap(nums, index++, i);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4, 0, 6};
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
