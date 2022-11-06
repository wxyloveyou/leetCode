/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num419_countBattleships
 * @create : 2022/11/6:20:57
 * @info : 419. 甲板上的战舰
 **/
public class Num419_countBattleships {

    public static int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'X') {
                    if (i > 0 && board[i - 1][j] == 'X') {
                        continue;
                    }
                    if (j > 0 && board[i][j - 1] == 'X') {
                        continue;
                    }
                    count++;
                }
            }
        }
        return count;
    }
}
