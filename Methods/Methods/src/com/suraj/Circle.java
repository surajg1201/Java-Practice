package com.suraj;
//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        System.out.println("Circumference of Circle: " + circumference(r));
        System.out.println("Area of Circle: "+ area(r));
    }
    static double circumference(int r){
        double circum= 2*3.14*r;
        return circum;
    }

    static double area(int r){
        double area = 3.14*r*r;
        return area;
    }
}
