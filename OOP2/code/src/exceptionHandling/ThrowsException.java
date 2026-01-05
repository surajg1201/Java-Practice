package exceptionHandling;

class Student1{
    private int age;

    public void setAge(int a) throws Exception {
        if(a<0){
            throw new Exception("Invalid age");
        }
        else{
             age=a;
        }
    }
    public int getAge(){
        return age;
    }
}
public class ThrowsException {
    public static void main(String[] args) {
        Student1 s = new Student1();
        try {
            s.setAge(32);
            System.out.println(s.getAge());
            s.setAge(-12);
            System.out.println(s.getAge());

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
