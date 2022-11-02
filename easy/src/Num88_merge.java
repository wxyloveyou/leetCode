/**
 * @PROJECT_NAME: leetCode
 * @USER: WXY
 * @DATE: 2022/11/2 10:58
 * Info: 88. 合并两个有序数组
 */
public class Num88_merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m + n];
        int index = 0;
        int i1 = 0, i2 = 0;
        while (i1 < m && i2 < n) {
            ans[index++] = nums1[i1] < nums2[i2] ? nums1[i1++] : nums2[i2++];
        }
        while (i1 <= m) {
            ans[index++] = nums1[i1++];
        }
        while (i2 <= n) {
            ans[index++] = nums2[i2++];
        }
        for (int i = 0; i < ans.length; i++) {
            nums1[i] = ans[i];
        }
    }

    public static void main(String[] args) {
        int[] num11 = {1, 2, 3, 0, 0, 0};
        int[] num22 = {4, 5, 6};

    }
}
