/**
 *  @info : leetcode 485. 最大连续 1 的个数
 */
public class Num485_findMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                max = Math.max(max,count);
            }else{
                count = 0;
            }
            
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1,1};
        int ans1 = findMaxConsecutiveOnes(arr);
        System.out.println(ans1);

    }
}