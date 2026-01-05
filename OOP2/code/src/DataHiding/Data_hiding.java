package DataHiding;

class A{
    int x = 10;
}
class B extends A{
    int x = 20;
    public void print(){
        System.out.println(x);
//        System.out.println(super.x);
    }
}
public class Data_hiding {
    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}
