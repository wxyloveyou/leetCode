import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author : WXY
 * @create : 2022-10-17 22:27
 * @Info : leetCode.628  三个数的最大乘积
 * 需要分正负  ，，
 * 全是正的或者全是负的， 最大的三个，
 * 有正有负，则是最大的三个正的乘积，或者是最小的两个负数和最大的正数乘积
 *
 *
 */
public class Num628_maximumProduct {
    public static int maximumProduct(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);
        }
        for (int i = nums.length - 1; i >= 0 ; i--) {
            nums[i] = heap.poll();
        }
        int sum1 = 1;
        int sum2 = 1;
        for (int i = 0; i < 3; i++) {
            sum1 *= nums[i];
        }
        int count = 0;
        for (int i = nums.length - 1; i > 0 ; i--) {
            count++;
            sum2 *= nums[i];
            if (count == 2) {
                break;
            }
        }
        return Math.max(sum1, sum2 * nums[0]);
    }
    public static int maximumProduct_1(int[] nums) {
        Arrays.sort(nums);
        int sum1 = 1;
        int sum2 = 1;
        sum1 = nums[0] * nums[1] * nums[nums.length - 1];
        sum2 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        return Math.max(sum1, sum2);
    }

    public static int[] generateRandomArray(int maxValue) {
        int[] arr = new int[20];
        arr[0] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        arr[1] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        arr[2] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        for (int i = 3; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
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
        int test = 10;
//        for (int i = 0; i < test; i++) {
//            int[] arr = generateRandomArray(5);
        int[] arr = {-1,-2,-3};
            int ans = maximumProduct_1(arr);
            printArray(arr);
            System.out.println(ans);
            System.out.println("++++++++++++++++++++");
//        }
    }
}
