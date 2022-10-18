import java.util.Arrays;

/**
 * @author : WXY
 * @create : 2022-10-18 11:04
 * @Info : leetCode 645. 错误的集合
 */
public class Num645_findErrorNums {
    public static int[] findErrorNums(int[] nums) {
        int len = nums.length ;
        int sum1 = 0;
        int sum2 = 0;
        int[] arr = new int[2];

        for (int i = 1; i <= len; i++) {
            sum1 += i;
        }
        for (int i = 0; i < len; i++) {
            sum2 += nums[i];
        }
        Arrays.sort(nums);
        int res = 0;
        int N = 0;
        for (int i = 0; i < len - 1; i++) {
            res = nums[i] ^ nums[i + 1];
            if (res == 0) {
                arr[0] = nums[i];
                arr[1] = nums[i] + sum1 - sum2;
                break;
            }
        }
        return arr;
    }
    public static int[] findErrorNums1(int[] nums) {
        int len = nums.length;
        int[] res = new int[2];
        for (int i = 0; i < len; i++) {
            int index = nums[i] % len;
            nums[index] += len;
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] <= len) {
                res[1] = i == 0 ? len : i;
            }
            if (nums[i] > 2 * len) {
                res[0] = i == 0 ? len : i;
            }
        }
        return res;


    }
    public static int[] findErrorNums2(int[] nums) {

        boolean[] showed = new boolean[nums.length + 1];
        int[] ans = new int[2];
        for (int num : nums) {

            if (showed[num]) ans[0] = num;
            else showed[num] = !showed[num];
        }
        for (int i = 1; i <= nums.length; i++) {

            if (!showed[i]) ans[1] = i;
        }
        return ans;
    }
    public static int[] findErrorNums4(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len + 1];
        int[] res = new int[2];
        for (int i = 0; i < len; i++) {
            arr[nums[i] ]++;
        }
        for (int i = 1; i <= len; i++) {
            if (arr[i] == 2) {
                res[0] = i ;
            }
            if (arr[i] == 0) {
                res[1] = i;
            }
        }
        return res;

    }


    public static int[] generateArray(int len) {
        int[] arr = new int[len];
        for (int i = 1; i < len; i++) {
            arr[i] = i;
        }
        int n = (int) (Math.random() * (len - 2 ));
        int m = (int) (Math.random() * (len - 2 ));
        arr[m] = arr[n];
        return arr;
    }


    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,4};
            printArray(arr);

            int[] ans = findErrorNums(arr);
            printArray(ans);
            System.out.println("+++++++++++++++");
       // }
    }
}
