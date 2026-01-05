class C{
    C(){
        System.out.println("Base class first constructor");

    }
    C(int i){
        System.out.println("Base class second constructor");
    }
}

class D extends C{
    D(int i){
        super(i);
        System.out.println("The value is " + i);
    }

}
public class Super_constructor {
    public static void main(String[] args) {
        D d = new D(10);
    }
}
