/**
 * @author : WXY
 * @create : 2022-09-11 11:09
 * @Info : leetCode 13罗马数字转整数
 */
public class Nun13_romanToInt {
    public static int romanToInt(String s) {
        int[] nums = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            switch (cur) {
                case 'I': nums[i] = 1;  break;
                case 'V': nums[i] = 5;  break;
                case 'X': nums[i] = 10;  break;
                case 'L': nums[i] = 50;  break;
                case 'C': nums[i] = 100;  break;
                case 'D': nums[i] = 500;  break;
                case 'M': nums[i] = 1000;  break;
            }
        }
        int ans = 0;
        for (int i = 0; i < s.length() ; i++) {
            if (i < nums.length - 1 && nums[i] < nums[i + 1]) {
                nums[i] =  -nums[i];
            }
                ans = ans + nums[i];

        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "III";
        System.out.println(romanToInt(str));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
