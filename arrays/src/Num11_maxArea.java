/**
 * leetCode : 11. 盛最多水的容器
 */
public class Num11_maxArea {
    public static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int N = height.length;
        int cur = 0;
        int L = 0;
        int R = N - 1;
        while (L <= R) {
            cur = Math.min(height[L], height[R]) * (R - L);
            max = Math.max(max, cur);
            if (height[L] <= height[R]) {
                L++;
            } else {
                R--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] arr1 = {1, 1};
        int ans1 = maxArea(arr);
        int ans2 = maxArea(arr1);
        System.out.println(ans1);
        System.out.println(ans2);
    }

}
