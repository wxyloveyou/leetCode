/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num551_checkRecord
 * @create : 2022/11/20:16:49
 * @info : 551. 学生出勤记录 I
 **/
public class Num551_checkRecord {
    public static boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        int N = s.length();
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length ; i++) {
            if (str[i] == 'A') {
                absent++;
                late = 0;
                if (absent == 2) {
                    return false;
                }
            }
            if (str[i] == 'L') {
                late++;
                if (late > 2) {
                    return false;
                }
            }
            if (str[i] == 'P') {
                late = 0;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "PPPALLL";
        boolean b = checkRecord(s);
        System.out.println(b);
    }
}
