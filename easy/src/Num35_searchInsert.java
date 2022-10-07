/**
 * @author : WXY
 * @create : 2022-10-07 19:31
 * @Info :  leetCode  35. 搜索插入位置
 */
public class Num35_searchInsert {
    public static int searchInsert(int[] nums, int target) {
        int L = 0;
        int R = nums.length - 1;
        int mid = 0;
        while (L <= R) {
            mid = (L + R) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                L = mid + 1;
            }else {
                R = mid - 1;
            }
        }
        return L;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,3,5,7,9};
        int num = searchInsert(arr,2);
        System.out.println(num);

    }
}
