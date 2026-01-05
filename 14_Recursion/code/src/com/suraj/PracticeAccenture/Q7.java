package com.suraj.PracticeAccenture;
//Implement the following Function
//
//def ProductSmallestPair(sum, arr)
//
//The function accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k,
//Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair
//
//NOTE
//
//Return -1 if array is empty or if n<2
//Return 0, if no such pairs found
//All computed values lie within integer range
//Example
//
//Input
//
//sum:9
//
//size of Arr = 7
//
//Arr:5 2 4 3 9 7 1
//
//Output
//
//2
//
//Explanation
//
//Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2
//
//Sample Input
//
//sum:4
//
//size of Arr = 6
//
//Arr:9 8 3 -7 3 9
//
//Sample Output
//
//-21

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        int[]arr = {9 ,8 ,3 ,-7 ,3 ,9} ;
        int sum = 4;
        System.out.println(productSmallestPair(sum,arr));
    }

    static int productSmallestPair(int sum, int[] arr){
        int n = arr.length;
        if(n<2){
            return -1;
        }
        Arrays.sort(arr);
        int prod = 0;
        int ans = arr[0]+arr[1];
        if(ans<=sum){
            prod = arr[0]*arr[1];
            return prod;
        }

        return 0;
    }

}
