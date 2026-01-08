package org.java.reviced.UserInput;

import java.util.*;

public class UserInput {
    public static void main(String[] args) {

        //take input
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Number:");
        int number = sc.nextInt();


        sc.nextLine();


        System.out.println("Enter Name:");
        String name= sc.nextLine();

        System.out.println("Enter age:");
        float age= sc.nextFloat();



        System.out.println(number);
        System.out.println(name);
        System.out.println(age);


        sc.close();


    }
}
