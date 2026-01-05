package com.suraj;

public class Conditionals {
    public static void main(String[] args) {
        int salary = 50000;

        if ( salary <= 20000 )  {
            salary += 20000;
        } else if (salary > 20000 && salary<=50000) {

            salary += 10000;
        } else {
            salary += 5000;
        }
        System.out.println(salary);
    }

}
