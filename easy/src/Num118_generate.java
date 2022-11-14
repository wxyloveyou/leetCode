import java.util.ArrayList;
import java.util.List;
/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num118_generate
 * @create : 2022/11/6:17:18
 * @info : 118. 杨辉三角
 **/
public class Num118_generate {
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

