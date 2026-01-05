package com.suraj;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int [] arr = new int[5];
//        arr[0]=1;
//        arr[1]=1;
//        arr[2]=1;
//        arr[3]=1;
//        arr[4]=1;
//        //[1,1,1,1,1]
//        System.out.println(arr[3]);
        //input using for loops

//        for(int i = 0;i< arr.length;i++)
//        {
//          arr[i]= in.nextInt();
//
//        }
//        for(int i = 0;i< arr.length;i++)
//        {
//            System.out.print(arr[i]);
//
//        }
//        System.out.println();
////        for(int num:arr){// Enhanced for loop: for every element in arr print element
////            System.out.print(arr[num]);
////        }
//        //another way to print
//        System.out.println(Arrays.toString(arr));
        String []str=new String[5];
        str[1] = "Suraj";
        System.out.println(Arrays.toString(str));
    }
}
