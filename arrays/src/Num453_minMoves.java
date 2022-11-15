import java.util.ArrayList;
import java.util.List;

/**
 * @author : WXY
 * @create : 2022-10-30 22:40
 * @Info : leetCode 453. 最小操作次数使数组元素相等
 *
 * 这个是一个数学题目；
 * 建立等式
 * 转换之后的和  n * x = sum + (n - 1) * times
 * n = nums.length
 * times ： 转化的次数
 * x : 转化的次数 + 最小值   x = times + min
 * 代入得到  n * (times + min) = sum + (n - 1) * times
 * times = sum - n * min
 */
public class Num453_minMoves {
    public static int minMoves(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
            sum += nums[i];
        }
        int n = nums.length;
        int times = sum - n * min;
        return times;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int ans = minMoves(arr);
        System.out.println(ans);

    }

    /**
     * @author : WXY
     * @program : LeetCode
     * @className ：Num453_minMoves.Num118_generate
     * @create : 2022/11/6:17:18
     * @info : 118. 杨辉三角
     **/
    public static class Num118_generate {
        public static List<List<Integer>> generate(int numRows) {
            List<List<Integer>> list = new ArrayList<List<Integer>>();
            for (int i = 0; i < numRows; i++) {
                List<Integer> subList = new ArrayList<Integer>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || i == j) {
                        subList.add(1);
                    } else {
                        subList.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                    }
                }
                list.add(subList);
            }
            return list;
        }

        public static void main(String[] args) {
            List<List<Integer>> generate = generate(3);
            System.out.println(generate);
        }
    }

    /**
     * @author : WXY
     * @program : LeetCode
     * @className ：Num453_minMoves.Num119_getRow
     * @create : 2022/11/6:20:11
     * @info : 119. 杨辉三角 II
     **/
    public static class Num119_getRow {
        public static List<Integer> getRow1(int rowIndex) {
            List<List<Integer>> list = new ArrayList<List<Integer>>();
            for (int i = 0; i <= rowIndex; i++) {
                List<Integer> subList = new ArrayList<Integer>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || i == j) {
                        subList.add(1);
                    } else {
                        subList.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                    }
                }
                list.add(subList);
            }
            return list.get(rowIndex);
        }

        public static List<Integer> getRow(int rowIndex) {
            ArrayList<Integer> list = new ArrayList<>();
            int N = rowIndex;
            for (int i = 0; i <= N; i++) {
                list.add(C(N, i));
            }
            return list;
        }

        private static Integer C(int N, int k) {
            long res = 1;
            for (int i = 1; i <= k; i++) {
                res = res * (N - k + i) / i;
            }
            return (int)res;
        }

        public static void main(String[] args) {
            List<Integer> row = getRow(3);
            System.out.println(row);
        }
    }
}
