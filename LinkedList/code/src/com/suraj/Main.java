package com.suraj;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(18);
        list.insert(77,3);
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        System.out.println(list.find(2));
        list.insertRec(88,2);
        list.display();
//        com.suraj.DLL list = new com.suraj.DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(12);
//        list.insertAfter(8,12);
//        list.display();
//        com.suraj.CLL list = new com.suraj.CLL();
//        list.insert(3);
//        list.insert(4);
//        list.insert(23);
//        list.insert(52);
//        list.delete(3);
//        list.display();

    }
}
