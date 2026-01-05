package exceptionHandling;
class Student{
 private int age;
 public void setAge(int a){
     if(a<0){
         try{
             throw new Exception("Invalid Age");
         }
         catch(Exception e){
             System.out.println(e.getMessage());
         }
     }
     else{
         age = a;
     }
 }
 public int getAge(){
     return age;
 }
}
public class ThrowException {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(-12);
        System.out.println(s.getAge());
    }
}
