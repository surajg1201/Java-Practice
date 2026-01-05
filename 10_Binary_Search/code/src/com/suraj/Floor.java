package com.suraj;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 1;
        int ans = floor(arr,target);
        System.out.println(ans);

    }

//    return the index of largest number <= target
    static int floor(int[] arr, int target){
        //but what if target element is smaller than the smallest element in the array, here end will become -1 by default, no need to write if.

        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            //find the middle element
            //int mid  = (start+end) / 2; //might be possible that (start+end) exceeds the range of integer in java

            int mid = start + (end -start)/2;

            if (target<arr[mid]){
                end = mid -1;

            } else if (target>arr[mid]) {
                start=mid+1;

            }
            else {
                //ans found
                return mid;
            }
        }
        return end;
    }
}