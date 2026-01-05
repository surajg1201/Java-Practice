package com.suraj.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        Integer num = 45;
        Integer a =10;
        Integer b =20;
        swap(a,b);
        System.out.println(a + " " + b);

//        final int BONUS = 2;
//        BONUS=3;
        final A suraj = new A("Suraj Gupta");
        suraj.name = "other name";

        // when a non primitive is final, you cannot reassign it.
//        suraj = new A("new object");

        A obj = new A("fecreve");
        System.out.println(obj);
//        for(int i = 0; i<1000000000; i++){
//            obj = new A("Random name");
//        }
    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a=b;
        b=temp;
    }
}

class A{
//    final int NUM;// this will give an error as final variables need to be initialized
    final int num =10;
    String name;
    public A(String name){
//        System.out.println("object created");
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed");
    }
}
