package ArraysAndHashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int []ans = new int[n];
        ans[0]=1;
        int prefix = 1;
        for(int i =0; i<n; i++){
            ans[i] = prefix;
            prefix*=nums[i];
        }
        int postfix = 1;
        for(int i = n-1; i>=0; i--){
            ans[i]*=postfix;
            postfix*=nums[i];
        }
        return ans;
    }
}
