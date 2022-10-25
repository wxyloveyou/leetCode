import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : WXY
 * @create : 2022-10-18 21:55
 * @Info : leetCode 448. 找到所有数组中消失的数字
 *
 * 方式一：利用桶的思想，找到消失的数字，
 * 方式二：使用数组的下标来标记数字的出现于否，通过一遍遍历即可标记出全部已经出现的数组
 *       [4,3,2,7,8,2,3,1] 初始数据
 *       [4,3,2,-7,8,2,3,1] 第一个数据 4 出现，将数组的第四个也就是下标 3 的数据修改为负数。-7 计算时，通过绝对值处理一下即可不影响数据的计算
 *       [4,3,-2,-7,8,2,3,1]
 *       [4,-3,-2,-7,8,2,3,1]
 *       [4,-3,-2,-7,8,2,-3,1]
 *       [4,-3,-2,-7,8,2,-3,-1]
 *       [4,-3,-2,-7,8,2,-3,-1]
 *       [4,-3,-2,-7,8,2,-3,-1]
 *       [-4,-3,-2,-7,8,2,-3,-1]
 *
 *       计算结束，数组的第五个，第六个依然为整数，证明 5,6 没有出现
 *
 */
public class Num448_findDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int len = nums.length > max ? nums.length : max;
        System.out.println("len : " + len);
        int[] arr = new int[len + 1];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        for (int i = 1; i <= len; i++) {
            if (arr[i] == 0) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1};
        List<Integer> list = findDisappearedNumbers(arr);
        System.out.println(list);

    }
}
