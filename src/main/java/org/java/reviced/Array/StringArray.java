package org.java.reviced.Array;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//print msg
        System.out.println("Enter Size of Students:");

        //decalre size varibale
        int size =sc.nextInt();

        //declere size of array
        String [] a = new String[size];

        sc.nextLine();
        System.out.println("Enter names of Students:");

        for (int i = 0; i < size; i++) {

             a [i] =sc.nextLine();
        }
        for (int i = 0; i < size ; i++) {
            System.out.println("Student :"+ a[i]);

        }






    }
}
