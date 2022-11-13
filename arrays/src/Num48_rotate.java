/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num48_rotate
 * @create : 2022/11/13:13:44
 * @info : 48. 旋转图像
 **/
public class Num48_rotate {
    public static void rotate(int[][] matrix) {
        //a 行 b 列， ，，c 行 d 列
        //左上        右下
        int a = 0;
        int b = 0;
        int c = matrix.length - 1;
        int d = matrix[0].length -1;
        while (a < c) {
            rotateEdge(matrix, a++, b++, c--, d--);
        }
    }

    private static void rotateEdge(int[][] m, int a, int b, int c, int d) {
        int temp = 0;
        for (int i = 0; i < d - b; i++) {
            temp = m[a][b + i];
            m[a][b+i] = m[c - i][b];
            m[c - i][b] = m[c][d - i];
            m[c][d - i] = m[a + i][d];
            m[a + i][d] = temp;
        }
    }

}
