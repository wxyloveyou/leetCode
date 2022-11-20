import com.sun.org.apache.xml.internal.security.utils.resolver.implementations.ResolverAnonymous;

/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num389_findTheDifference
 * @create : 2022/11/20:15:26
 * @info : 389. 找不同
 **/
public class Num389_findTheDifference {
    public static char findTheDifference(String s, String t) {
        char[] strT = t.toCharArray();
        char[] strS = s.toCharArray();
        int numT = 0,numS = 0;
        for (int i = 0; i < strT.length; i++) {
            numT += strT[i] - 'a';
        }
        for (int i = 0; i < strS.length; i++) {
            numS += strS[i] - 'a';
        }
        return (char) ((numT - numS) + 'a');
    }

    public static char findTheDifference1(String s, String t) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            ans ^= t.charAt(i);
        }
        return (char) ans;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char theDifference = findTheDifference1(s, t);
        System.out.println(theDifference);

    }
}
