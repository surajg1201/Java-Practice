package com.suraj;

public class Main {
    public static void main(String[] args)
    {
//             int[] rollNo = new int[5];
             // or directly
//            int [] rollNo2 = {1,2,3,4,5};
        int []rnos; // this is declaration.(Happens at compile time.
        rnos=new int[5];// this is initialization. here object is created in the heap.(Happens at runtime)
        System.out.println(rnos[1]);// by default it will show 0 only for every element.
        String[] arr = new String[4];
        System.out.println(arr[3]);// by default for an empty string array it will show null(literal).


    }
}