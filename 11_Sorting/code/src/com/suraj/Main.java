package com.suraj;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        //bubbleSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[]arr){
        for (int i = 0; i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }

            }
        }
    }
    static void selectionSort(int []arr){
        for(int i=0; i<arr.length;i++){
            //find the max element in remaining array and swap it with the last element
            int last = arr.length - i - 1;
            int maxIndex =  getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int []arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
    static int getMaxIndex(int[]arr,int start,int end){

        int max= start;
        for(int i =0;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void bubbleSort(int []arr){
        // run the steps n-1 times
        for(int i=0;i<arr.length;i++){
            boolean swapped =false;
            //for each step, max item will come at the last respective index
            for(int j =1;j< arr.length-i;j++){
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
//            if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if(!swapped){
                break;
            }
        }
    }
}