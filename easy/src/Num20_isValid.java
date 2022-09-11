import java.util.Stack;

/**
 * @author : WXY
 * @create : 2022-09-11 11:26
 * @Info : leetCode 20.有效的括号
 */
public class Num20_isValid {
    public static boolean isValid(String s) {
        char[] str = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        char ch = ' ';
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '(' || str[i] == '[' || str[i] == '{') {
                stack.add(str[i]);
            } else  {
                if (stack.isEmpty() && ((str[i] == ')') || (str[i] == ']') || (str[i] == '}'))) {
                    return false;
                }
                if ((!stack.isEmpty()) && ((str[i] == ')' && stack.peek() != '(') || (str[i] == ']' && stack.peek() != '[')||(str[i] == '}' && stack.peek() != '{'))) {
                    stack.pop();
                    return false;
                }
                if ((!stack.isEmpty()) && ((str[i] == ')' && stack.peek() == '(') || (str[i] == ']' && stack.peek() == '[')||(str[i] == '}' && stack.peek() == '{'))) {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
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
