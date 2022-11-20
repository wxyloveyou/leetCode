import java.util.PriorityQueue;

/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num451_frequencySort
 * @create : 2022/11/20:16:15
 * @info : 451. 根据字符出现频率排序
 **/
public class Num451_frequencySort {
    public static String frequencySort(String s) {
        char[] str = s.toCharArray();
        int[] arr = new int[128];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> arr[b] - arr[a]);
        for (char c :
                str) {
            arr[c]++;
        }
        for (int i = 0; i < 128; i++) {
            if (arr[i] > 0) {
                pq.add(i);
            }
        }
        String ans = "";
        while (!pq.isEmpty()) {
           int c = pq.poll();
            for (int i = 0; i < arr[c]; i++) {
                ans += (char)c;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        String s = "abbc";
        String ans = frequencySort(s);
        System.out.println(ans);

    }
}
