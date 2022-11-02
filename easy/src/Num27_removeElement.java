import com.sun.deploy.security.CredentialManager;

/**
 * leetCode 27. 移除元素
 */
public class Num27_removeElement {
    public static  int removeElement(int[] nums, int val) {
        int index = 0 ;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 3, 4, 4, 2};
        int i = removeElement(arr, 3);
        System.out.println(i);

    }
}
