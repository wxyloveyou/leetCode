/**
 * @author : WXY
 * @create : 2022-11-01 16:05
 * @Info : leetCode 1111. 有效括号的嵌套深度
 */
public class Num1111_maxDepthAfterSplit {
    public static int[] maxDepthAfterSplit(String s) {
        char[] str = s.toCharArray();
        int[] arr = new int[str.length];
        arr[0] = 1;
        for (int i = 1; i < str.length; i++) {
            if (str[i] == '(') {
                arr[i] = str[i - 1] == ')' ? arr[i - 1] : arr[i - 1] + 1;
                arr[i] = arr[i] % 2 == 0 ? 0 : 1;
            } else {
                arr[i] = str[i - 1] == ')' ? arr[i - 1] - 1 : arr[i - 1];
                arr[i] = arr[i] % 2 == 0 ? 0 : 1;
            }
        }
        return arr;
    }

    private static boolean isVaild(char[] str) {
        if (str == null || str.length == 0) {
            return false;
        }
        int status = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] != '(' && str[i] != ')') {
                return false;
            }
            if (str[i] == ')' && --status < 0) {
                return false;
            }
            if (str[i] == '(') {
                status++;
            }
        }
        return status == 0;
    }

    public static void main(String[] args) {
        String s = "(()())()(()())";
        int[] ints = maxDepthAfterSplit(s);
        for (int i:
        ints){
            System.out.print(i + " ");
        }
    }
}
