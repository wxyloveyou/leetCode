/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num383_canConstruct
 * @create : 2022/11/20:15:39
 * @info : 383. 赎金信
 **/
public class Num383_canConstruct {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        char[] strNote = ransomNote.toCharArray();
        char[] strMaga = magazine.toCharArray();
        for (int i = 0; i < strNote.length; i++) {
            arr[strNote[i] - 'a']++;
        }
        for (int i = 0; i < strMaga.length; i++) {
            arr[strMaga[i] - 'a']--;
            if (arr[strNote[i] - 'a'] > 0) {
                return false;
            }
        }
        for (int i = 0; i < strNote.length; i++) {
            if (arr[strNote[i] - 'a'] > 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean canConstruct1(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (char c :
                magazine.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c :
                ransomNote.toCharArray()) {
            arr[c - 'a']--;
            if (arr[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
