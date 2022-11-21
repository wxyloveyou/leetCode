import java.util.ArrayList;
import java.util.List;

/**
 * @author : WXY
 * @program : LeetCode
 * @className ：Num412_fizzBuzz
 * @create : 2022/11/20:21:52
 * @info : 412. Fizz Buzz
 **/
public class Num412_fizzBuzz {
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        int i = 1;
        while (i <= n) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> strings = fizzBuzz(5);
        System.out.println(strings);

    }
}
