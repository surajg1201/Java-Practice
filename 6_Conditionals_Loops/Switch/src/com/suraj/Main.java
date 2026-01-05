package com.suraj;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
        int days = in.nextInt();
//        switch (fruit) {
//            case "Mango" -> System.out.println("Mango is the king of fruits");
//            case "Orange" -> System.out.println("Also a colour");
//            case "Apple" -> System.out.println("It is sweetest");
//            case "Grapes" -> System.out.println("It is used to make wine");
//            default -> System.out.println("Please enter a valid fruit.");
        switch(days){
            case 1,2,3,4,5-> System.out.println("Day 5");
            case 6,7-> System.out.println("Day 7");
        }

    }
}
    
