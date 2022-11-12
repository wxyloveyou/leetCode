/**
 * leetCode :  5. 最长回文子串
 */
public class Num05_longestPalindrome {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        String ans = "";
        //"12321" -> "#1#2#3#2#1#"
        char[] str = manacherString(s);
        for (int i = 0; i < str.length; i++) {
            String s1 = palindrome(str, i);
            if (s1.length() >= ans.length()) {
                ans = s1;
            }
        }
        String answer = rest(ans);
        return answer;
    }

    private static String rest(String ans) {
        String s = "";
        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) != '#') {
                s = s + ans.charAt(i);
            }
        }
        return s;
    }

    private static String palindrome(char[] str, int i) {
        int L = i - 1;
        int R = i + 1;
        String string = String.valueOf(str[i]);
        while (L >= 0 && R < str.length) {
            if (str[L] == str[R]) {
                string = str[L] + string + str[R];
            }else {
                break;
            }
            L--;
            R++;
        }
        return string;
    }

    public static int manacher(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        //"12321" -> "#1#2#3#2#1#"
        char[] str = manacherString(s);
        //回文半径的大小
        int[] pArr = new int[str.length];
        int c = -1;
        //讲述中，R代表最右的扩成功的位置，代码中，最右的扩成功位置的，再下一个位置
        int R = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length; i++) {
            // R第一个违规的位置，i>= R
            // i位置扩出来的答案，i位置扩的区域，至少是多大。
            pArr[i] = R > i ? Math.min(pArr[2 * c - i], R - i) : 1;
            while (i + pArr[i] < str.length && i - pArr[i] > -1) {
                if (str[i + pArr[i]] == str[i - pArr[i]]) {
                    pArr[i]++;
                } else {
                    break;
                }
            }
            if (i + pArr[i] > R) {
                R = i + pArr[i];
                c = i;
            }
            max = Math.max(max, pArr[i]);
        }
        return max - 1;
    }

    private static char[] manacherString(String str) {
        char[] charArr = str.toCharArray();
        char[] res = new char[2 * charArr.length + 1];
        int index = 0;
        for (int i = 0; i < res.length; i++) {
            res[i] = (i & 1) == 0 ? '#' : charArr[index++];
        }
        return res;
    }
    //for test
    public static int right(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] str = manacherString(s);
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            int L = i - 1;
            int R = i + 1;
            while (L >= 0 && R < str.length && str[L] == str[R]) {
                L--;
                R++;
            }
            max = Math.max(max, R - L - 1);
        }
        return max / 2;
    }

    //for test
    public static String getRandomString(int possibilities, int size) {
        char[] ans = new char[(int) (Math.random() * size) + 1];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = (char) ((int) (Math.random() * possibilities) + 'a');
        }
        return String.valueOf(ans);
    }

    public static void main(String[] args) {
        int possibilities = 5;
        int strSize = 10;
        int testTimes = 1000;
        System.out.println("test Begin!");
//        for (int i = 0; i < 3; i++) {
            String str = getRandomString(possibilities, strSize);
            System.out.println(str);
            String ans = longestPalindrome(str);
            System.out.println(ans);
//            int manacher = manacher(str);
//            System.out.println(manacher);
//        }
        System.out.println("FINISH");

    }



}
