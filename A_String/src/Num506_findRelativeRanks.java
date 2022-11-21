import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num506_findRelativeRanks
 * @create : 2022/11/20:22:02
 * @info : 506. 相对名次
 **/
public class Num506_findRelativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        TreeMap<Integer, Integer> map = new TreeMap<>((a, b) -> b - a);
        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }
        String[] ans = new String[score.length];
        int k = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            k++;
            if (k == 1) ans[entry.getValue()] = "Gold Medal";
            else if (k == 2) ans[entry.getValue()] = "Silver Medal";
            else if (k == 3) {
                ans[entry.getValue()] = "Bronze Medal";
            } else {
                ans[entry.getValue()] = String.valueOf(k);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 8, 9, 4};
        String[] ans = findRelativeRanks(arr);
        for (String s : ans) {
            System.out.print(s + " ");
        }

    }
}
