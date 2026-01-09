package org.java.reviced.Array;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {

        int [] a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array ki Size Enter ker Bhai  :");

        int Arraysize = sc.nextInt();

        a = new int[Arraysize];

        sc.nextLine();

        System.out.println("Enter Array : ");


    try {
        //take Input and store
        for (int i = 0; i < Arraysize ; i++) {
            a [i] =sc.nextInt();
        }

    }catch (Exception e){
        System.out.print(e);

    }

sc.nextLine();

        //print
        for (int i = 0; i < Arraysize; i++) {
            System.out.println("Array : " +" "+i+"th : "+ a[i]);



        }
        System.out.print("{");
        for (int i = 0; i < Arraysize; i++) {
            System.out.print(a[i] );



        }

        System.out.print("}");

        sc.close();




    }
}
