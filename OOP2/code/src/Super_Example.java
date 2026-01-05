import java.util.*;
import java.io.*;
class A{
    public void print(){

        System.out.println("I am a super class");
    }
}

class B extends A{
    public void print(){

        System.out.println("I am Derived class");
    }
    public void printSuper(){

        super.print();
    }


}
public class Super_Example {
    
    public static void main(String[] args) {
        B b = new B();
        b.printSuper();
        b.print();
    }
}