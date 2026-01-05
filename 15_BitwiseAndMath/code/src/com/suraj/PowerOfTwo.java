package com.suraj;

public class PowerOfTwo {
    public static void main(String[] args) {
        boolean ans;
        int n = 5; //note: fix for n=0 as false
        if (n==0){
            ans = false;
        }
        else {
            ans = (n & (n - 1)) == 0;
        }
        System.out.println(ans);
    }
}
