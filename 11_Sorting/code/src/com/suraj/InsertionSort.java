package com.suraj;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr= new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    static int[] insertionSort(int[]arr){
        for (int i = 0; i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
        return arr;
    }
    static void swap(int []arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
