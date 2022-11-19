/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num169_majorityElement
 * @create : 2022/11/17:23:01
 * @info : 169. 多数元素
 **/

public class Num169_majorityElement {

    public static int majorityElement(int[] nums) {
        int c = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                c = nums[i];
            }
            if (c == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return c;
    }
}
