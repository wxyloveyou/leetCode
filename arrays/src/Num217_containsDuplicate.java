import java.util.Arrays;
import java.util.HashSet;

/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num217_containsDuplicate
 * @create : 2022/11/19:8:32
 * @info : 217. 存在重复元素
 **/
public class Num217_containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        //set 自带去重，长度短了，必然有重复
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.size() < nums.length ? true : false;
    }
    public static boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,1, 2, 3, 4, 5};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);

    }

}
