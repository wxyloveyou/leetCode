import java.util.HashMap;

/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num219_containsNearbyDuplicate
 * @create : 2022/11/19:8:58
 * @info : 219. 存在重复元素 II
 **/
public class Num219_containsNearbyDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
