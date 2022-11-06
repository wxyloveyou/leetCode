import javax.swing.*;
import java.util.Arrays;

/**
 * @author : WXY
 * @program : LeetCode
 * @className ：class6230
 * @create : 2022/11/6:10:50
 * @info : 竞赛318  class6230 超时了，
 **/
public class class6230 {
    public static long maximumSubarraySum(int[] nums, int k) {
        int N = nums.length;
        int L = 0;
        int R = L + k;
        int max = Integer.MIN_VALUE;
        int[] help = new int[k];
        int[] ansMax = new int[N - 2];
        int index = 0;
        while (R <= N) {
            int j = 0;
            for (int i = L; i < R; i++) {
                ansMax[index] += nums[i];
                help[j++] = nums[i];
            }
            Arrays.sort(help);
            for (int i = 1; i < help.length; i++) {
                if (help[i - 1] == help[i]) {
                    ansMax[index] = 0;
                    break;
                }
            }
            L++;
            R++;
            index++;
        }
        max = ansMax[0];
        for (int i = 1; i < ansMax.length; i++) {
            if (max < ansMax[i]) {
                max = ansMax[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,4,5};
        int[] sum = {1,5,4,2,9,9,9};
        int k = 3;
        long l = maximumSubarraySum(sum, k);
        long m = maximumSubarraySum(arr, 4);
        System.out.println(m);
        System.out.println(l);

    }
}
