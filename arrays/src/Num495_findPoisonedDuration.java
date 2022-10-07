/**
 * @info : leetcode  495. 提莫攻击
 */

import javafx.scene.paint.Stop;

public class Num495_findPoisonedDuration{
    public static int findPoisonedDuration_1(int[] timeSeries, int duration) {
        // int n = timeSeries.length;
        int ans = 0;
        int expired = 0;
        for (int i = 0; i < timeSeries.length; i++) {
           if(timeSeries[i] >= expired){
            ans += duration;
           }else{
            ans += timeSeries[i] + duration - expired;
           }
            expired = timeSeries[i] + duration;
        }
        return ans;
    }
    //中毒时间拉满，减去重复的时间
    public static int findPoisonedDuration(int[] timeSeries,int duration) {
        int ans = timeSeries.length * duration;
        for (int i = 1; i < timeSeries.length; i++) {
            if(timeSeries[i] - timeSeries[i - 1] < duration){
                ans -= duration - (timeSeries[i] - timeSeries[i - 1]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,4};
        int duration = 2;
        int ans1 = findPoisonedDuration_1(arr, duration);
        int ans2 = findPoisonedDuration(arr, duration);
        System.out.println(ans1);
        System.out.println(ans2);
    }
}