package com.suraj;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,7,7,7,7,8,9};
        int [] ans = searchRange(arr,7);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target){

        int []ans = {-1,-1};
        //check for the first occurrence of target first
        ans[0]= search(nums, target, true);
        if(ans[0]!=-1) {
            ans[1] = search(nums, target, false);
        }
        return ans;

    }
    //this function just returns the index value of the target
    static int search(int[]nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;

        while(start<=end) {
            //find the middle element
            //int mid  = (start+end) / 2; //might be possible that (start+end) exceeds the range of integer in java

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;

            } else if (target > nums[mid]) {
                start = mid + 1;

            } else {
                //potential ans found
                ans =  mid;
                if(findStartIndex){
                    end = mid-1;

                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
