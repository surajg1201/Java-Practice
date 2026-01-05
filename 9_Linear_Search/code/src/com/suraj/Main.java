package com.suraj;

public class Main
{
    public static void main(String[] args)
    {
        int[] nums = {5, 3, 2, 9, 1};
        int target = 9;

        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }


    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target)
                return i;
        }
        return-1;
    }

}


