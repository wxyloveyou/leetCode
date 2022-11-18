/**
 * @program: LeetCode
 * @ClassName Num169_majorityElement
 * @description: LeetCode : 169. 多数元素
 * @author: WXY
 * @create: 2022-11-18 08:27
 * @Version 1.0
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
