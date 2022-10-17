import java.util.Set;
import java.util.TreeSet;

/**
 * @author : WXY
 * @create : 2022-10-17 21:42
 * @Info : leetCode.414 第三大的数 时间 O(n)
 *  内存消耗小，时间大
 */
public class Num414_thirdMax_2 {
    public static int thirdMax(int[] nums) {
        Set set = new TreeSet();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        Object[] array = set.toArray();
        if (set.size() < 3) {
            return (int) array[array.length - 1];
        }
        return (int) array[array.length - 3];
    }

    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
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
        int testTime = 10;
//        for (int i = 0; i < testTime; i++) {
//            int[] arr = generateRandomArray(10, 20);
             int[] arr = {1,2,-2147483648};

            printArray(arr);
            long  num = thirdMax(arr);
            System.out.println(num);
            System.out.println("++++++++++++++++");
//        }

    }
}
