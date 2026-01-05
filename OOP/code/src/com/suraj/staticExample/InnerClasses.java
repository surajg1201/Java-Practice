package com.suraj.staticExample;

public class InnerClasses {
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Suraj");
        Test b = new Test("Aditya");
    }
}

//static class A{
//
//}
