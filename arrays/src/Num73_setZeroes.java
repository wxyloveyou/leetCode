import java.util.HashSet;
import java.util.Set;

/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num73_setZeroes
 * @create : 2022/11/13:13:55
 * @info : 73. 矩阵置零
 **/
public class Num73_setZeroes {
    public static void setZeroes(int[][] matrix) {
        Set<Integer> cow = new HashSet<>(); // 记录行的值
        Set<Integer> rol = new HashSet<>(); //记录列的值
        int c = matrix.length;
        int r = matrix[0].length;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                if (matrix[i][j] == 0) {
                    cow.add(i);
                    rol.add(j);
                }
            }
        }
        for (Integer cow_1 : cow) { // 将行设置为零
            for (int i = 0; i < r; i++) {
                matrix[cow_1][i] = 0;
            }
        }
        for (Integer col_1 : rol) {//将列设置为零
            for (int i = 0; i < c; i++) {
                matrix[i][col_1] = 0;
            }
        }
    }
}
