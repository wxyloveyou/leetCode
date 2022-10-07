/**
 * @author : WXY
 * @create : 2022-10-07 20:49
 * @Info : leetCode 58. 最后一个单词的长度
 */
public class Num58_lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        char[] str = s.toCharArray();
        int len = str.length - 1;
        int count = 0;
        boolean flag = true;
        for (int i = len; i >= 0; i--) {
            if (str[i] == ' ') {
                if (flag == false) {  //在遇到单词的情况，遇到了空格，表示最后一个单词读完了，直接返回即可
                    return count;
                }
                continue; //表示尾部是空格直接跳过，
            } else {
                count++;
                flag = false; // 表示遇到了单词，而且是尾部的单词，
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "124 sadf  sdfjsdaf";
        int num = lengthOfLastWord(s);
        System.out.println(num);
    }
}
