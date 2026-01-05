package com.suraj.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //store 5 numbers
        int[] numbers = new int[5];
        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        Student[] students = new Student[5];
// just declaring
//        Student suraj;
//        suraj = new Student();


        Student suraj = new Student(123,"Suraj Gupta",89f);
        Student aditya = new Student();

//        suraj.name = "Suraj";
//        suraj.marks = 92f;
//        suraj.rno = 7984;
//        suraj.changeName("giga chad");
//        suraj.greeting();
        System.out.println(suraj.rno);
        System.out.println(suraj.name);
        System.out.println(suraj.marks);
        Student random = new Student(suraj);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;
        one.name = "Something something";
        System.out.println(two.name);
    }
}
//    create a class
     class Student{
        int rno;
        String name;
        float marks =90; // default values are taken if no value is found above

        //we need a way to add the values of the above
//    properties object by object
//    we need one word to access every object

        void greeting(){

            System.out.println("Hello! My name is " + this.name);
        }
        void changeName(String newName){
            name = newName;
        }
        Student(Student other){
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

        Student(){
//            this is how you call a constructor from another constructor
//            internally: new Student (13,"default person", 100.0f);
            this(13, "default person", 100.f);
        }
        Student(int roll, String name, float marks){
        this.rno = roll;
        this.name = name;
        this.marks= marks;
        }
    }
