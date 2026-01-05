package com.suraj;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);
    //type casting
        int num = (int)(32.12f);
        System.out.println(num);
    //automatic type promotion in expressions
//        int a=257;
//        byte b = (byte)(a); //257 % 256 = 1

//        byte a = 40;
//        byte b =50;
//        byte c = 100;
//        int d = a*b / c;
//
//        System.out.println(d);
//        byte b =50;
//        b = b * 2;// this will give an error since byte was implicitly type casted into int in the above lines of code therefore it cannot convert it back to int implicitly(According to precedence).
    int number = 'A';
//    System.out.println(number);//prints the ASCII value
//        System.out.println("नमस्कार");//Supports this because its in unicode, therefore you can print any language in java

    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i =50000;
    float f = 5.67f;
    double d = 0.1234;
    double result = (f*b) + (i/c) - (d * s) ;
    // float + int - double = double
    System.out.println((f*b)+" "+(i/c) + " "+(d-s));
    System.out.println(result);
    }
}
