package com.suraj;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = sumOfNum(n);
        System.out.println(sum);
    }

    static int sumOfNum(int n){
        int sum=0;
        for (int i =1; i<=n; i++){
            sum = sum+i;
        }
        return sum;
    }
}
