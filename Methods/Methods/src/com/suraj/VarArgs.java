package com.suraj;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
    fun(2,3,4,5,6,6,7);
    multiple(1,2,1,3,5,6);
    }
    static void multiple(int a,int b, int ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));


    }
}
