import java.util.Stack;

/**
 * @author : WXY
 * @create : 2022-09-11 11:26
 * @Info : leetCode 20.有效的括号
 */
public class Num20_isValid {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c=='(')stack.push(')');
            else if(c=='[')stack.push(']');
            else if(c=='{')stack.push('}');
            else if(stack.isEmpty()||c!=stack.pop())return false;
        }
        return stack.empty();
    }

    public static boolean isValid_2(String s) {
        char[] str = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length; i++) {
            switch (str[i]) {
                case '(' : stack.push(')');break;
                case '[' : stack.push(']');break;
                case '{' : stack.push('}');break;
                default : {
                    if (stack.isEmpty() || str[i] != stack.peek()) {
                        return false;
                    } else {
                        stack.pop();break;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(isValid(str));
        System.out.println(isValid_2(str));
        System.out.println(isValid("(]}"));
        System.out.println(isValid_2("(]}"));
        System.out.println(isValid("(){{{{"));
        System.out.println(isValid_2("(){{{{"));
        System.out.println(isValid("}[(){}]"));
        System.out.println(isValid_2("}[(){}]"));
    }
}
