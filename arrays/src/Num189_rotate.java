/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num189_rotate
 * @create : 2022/11/6:21:01
 * @info : 189. 轮转数组
 **/
public class Num189_rotate {
    public static void rotate(int[] nums, int k) {
        int N = nums.length - 1;
        k = k % nums.length;
        reverse(nums, 0, N);
        reverse(nums, 0, k - 1);
        reverse(nums, k, N);

    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);
    }
}
