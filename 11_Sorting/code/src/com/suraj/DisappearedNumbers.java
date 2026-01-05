package com.suraj;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//google ques
class DisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {

            int i = 0;
            while (i < nums.length) {
                int correct = nums[i] - 1;//value-1
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }
//        Just find missing numbers
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                if (index + 1 != nums[index]) {
                    ans.add(index + 1);
                }
            }
            return ans;

        }
    static void swap( int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

