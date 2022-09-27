/**
 * @info : leetcode  66. 加一
 */
public class Num66_plusOne{

    public static int[] plusOne(int[] digits) {
        
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;    
        return ans;
    }
    public static void main(String[] args) {
       int[] arr = {1,2,3};
      
       int[] ans = plusOne(arr);
       for (int i = 0; i < ans.length; i++) {
        System.out.print(i);
        
       }
    }
}