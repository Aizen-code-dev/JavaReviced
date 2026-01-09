package org.java.reviced.Array;

import java.util.Scanner;

public class TwoInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);

        System.out.println("Enter size of  students ");
        int size = sc.nextInt();

        String [] students = new String[size];
        int [] rollno  = new int [size];

        sc.nextLine();

        //take input
        System.out.println("Enter Names: ");
        for (int i = 0; i < size; i++) {

            students [i]=sc.nextLine();


        }
        System.out.println("Enter roll no: ");

        for (int i = 0; i < size; i++) {
            rollno [i]=sc.nextInt();

        }


        //  Print Array
        for (int i = 0; i < size ; i++) {
            System.out.println("Student: "+ students[i] + " "+"Roll no :" + rollno[i] );



        }
        sc.close();


    }
}
