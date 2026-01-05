package com.suraj;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));

        System.out.println("a"+1);
//        this is the same as after a few steps: "a" + "1"
//        integer will be converted to Integer that will call toString()

        System.out.println("Suraj" + new ArrayList<>());
        System.out.println("Suraj" + new Integer(56));
        String ans= new Integer(56) + "" + new ArrayList<>();// Presence of a string is necessary for concatenation and the whole type is also required to be string
        System.out.println(ans);
    }
}
