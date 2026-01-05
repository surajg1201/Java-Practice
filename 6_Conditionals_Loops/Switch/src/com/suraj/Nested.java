package com.suraj;

import java.util.Scanner;

public class Nested
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        int emp_id = in.nextInt();
        String department = in.next();

        switch (emp_id)
        {
            case 1 -> System.out.println("Suraj");
            case 2 -> System.out.println("Nehal");
            case 3 ->
            {
                switch (department)
            {
                case "HR" -> System.out.println("HR department");
                case "IT" -> System.out.println("IT department");
                default -> System.out.println("No department chosen");
            }
            }
            default -> System.out.println("Invalid Emp ID");
        }
    }
}
