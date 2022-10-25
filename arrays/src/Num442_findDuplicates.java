import sun.nio.cs.ext.MacRoman;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : WXY
 * @create : 2022-10-25 19:46
 * @Info : LeetCode 442. 数组中重复的数据
 *
 *  方式一：利用桶的思想
 *  方式二：利用相反数
 */
public class Num442_findDuplicates {
    public static List<Integer> findDuplicates_1(int[] nums) {
        int len = nums.length;
        int[] arr = new int[nums.length + 1];
        for (int i = 0; i < len; i++) {
            arr[nums[i]]++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= len; i++) {
            if (arr[i] == 2) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] *=  -1;
            } else {
                list.add(Math.abs(nums[i]));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> list = findDuplicates(arr);
        System.out.println(list);

    }
}
