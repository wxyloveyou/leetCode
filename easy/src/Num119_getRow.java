import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num119_getRow
 * @create : 2022/11/6:20:11
 * @info : 119. 杨辉三角 II
 **/
public class Num119_getRow {
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
