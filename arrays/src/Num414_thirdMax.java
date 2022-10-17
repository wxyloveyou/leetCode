/**
 * @author : WXY
 * @create : 2022-10-17 21:42
 * @Info : leetCode.414 第三大的数 时间 O(n)
 *   [1,2,-2147483648] 这个用例太恶心了， ，，
 */
public class Num414_thirdMax {
    public static int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thireMax = Long.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == thireMax || nums[i] == secondMax || nums[i] == firstMax) {
                continue;
            }
            count++;
            if (nums[i] >= firstMax) {
                thireMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            } else if (nums[i] >= secondMax) {
                thireMax = secondMax;
                secondMax = nums[i];
            } else if (nums[i] >= thireMax) {
                thireMax = nums[i];
            }
        }
        return count >= 3 ? (int)thireMax : (int)firstMax;
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
