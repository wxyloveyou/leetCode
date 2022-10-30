/**
 * @author : WXY
 * @create : 2022-10-30 22:40
 * @Info : leetCode 453. 最小操作次数使数组元素相等
 *
 * 这个是一个数学题目；
 * 建立等式
 * 转换之后的和  n * x = sum + (n - 1) * times
 * n = nums.length
 * times ： 转化的次数
 * x : 转化的次数 + 最小值   x = times + min
 * 代入得到  n * (times + min) = sum + (n - 1) * times
 * times = sum - n * min
 */
public class Num453_minMoves {
    public static int minMoves(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
            sum += nums[i];
        }
        int n = nums.length;
        int times = sum - n * min;
        return times;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int ans = minMoves(arr);
        System.out.println(ans);

    }
}
