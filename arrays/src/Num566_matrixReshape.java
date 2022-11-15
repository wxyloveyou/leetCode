/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num566_matrixReshape
 * @create : 2022/11/14:20:04
 * @info : 566. 重塑矩阵
 **/
public class Num566_matrixReshape {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length; // 行 r值
        int n = mat[0].length; // 列 c 值
        if (r * c != m * n) {
            return mat;
        }
        int[][] ans = new int[r][c];
        for (int i = 0; i < m * n; i++) {
            ans[i / c][i % c] = mat[i / n][i % n];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 7}};
        int r = 4;
        int c = 1;
        int[][] ints = matrixReshape(arr, r, c);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                System.out.print(ints[i][j] + " ");

            }
        }
    }
}
