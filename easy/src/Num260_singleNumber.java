import com.sun.org.apache.xml.internal.dtm.ref.DTMAxisIterNodeList;

/**
 * @program: LeetCode
 * @ClassName Num_
 * @description: LeetCode : 260. 只出现一次的数字 III
 * @author: WXY
 * @create: 2022-11-04 16:46
 * @Version 1.0
 **/

public class Num260_singleNumber {
    public static int[] singleNumber(int[] nums) {
        int cur = 0;
        int only = 0;
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            cur ^= nums[i];
        }
        only = cur & -cur; // 找到最左侧的1
        for (int i = 0; i < nums.length; i++) {
            if ((only & nums[i]) == 0) {
                ans[0] ^= nums[i];
            } else {
                ans[1] ^= nums[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 2, 2, 3,3,5, 4};
        int[] ans = singleNumber(arr);
        for (int i :
                ans) {
            System.out.println(i);
        }
    }
}
