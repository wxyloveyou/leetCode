/**
 * @author : WXY
 * @program : LeetCode
 * @className ：class6229
 * @create : 2022/11/6:10:32
 * @info : 318竞赛  class6229
 **/
public class class6229 {
    public static int[] applyOperations(int[] nums) {
        int N = nums.length;
        for (int i = 0; i < N - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = 2 * nums[i];
                nums[i + 1] = 0;
            }
        }
        int[] ans = new int[N];
        int index = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] != 0) {
                ans[index++] = nums[i];
            }
        }
        return ans;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        int[] ints = applyOperations(arr);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
