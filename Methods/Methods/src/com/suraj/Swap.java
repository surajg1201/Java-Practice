package com.suraj;

public class Swap {
    public static void main(String[] args) {

        int a=20, b=30, temp;

//        temp=a;
//        a=b;
//        b=temp;
        swap(a,b);
        System.out.println(a+" "+b);


    }
    static void swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);

    }
}
