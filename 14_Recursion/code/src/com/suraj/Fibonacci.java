package com.suraj;

public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println(fibo(6));
         System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int n){// golden ratio method
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
    static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);

    }
}
