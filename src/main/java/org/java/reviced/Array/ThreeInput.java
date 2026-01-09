package org.java.reviced.Array;

import java.util.Scanner;

public class ThreeInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size of Employe : ");
        int size = sc.nextInt();

        //varible declare

        String []  Empname = new String[size];
        int  [] id =new int[size];
        double [] salary = new double[size];

        sc.nextLine();


        //Take Input

        System.out.println("Enter Emp name :");
        for (int i = 0; i < size; i++) {

            Empname [i] = sc.nextLine();

        }
        System.out.println("Enter Emp Id:");
        for (int i = 0; i < size; i++) {

            id [i] =sc.nextInt();

        }
        System.out.println("Enter salary: ");
        for (int i = 0; i < size; i++) {

            salary [i] =sc.nextDouble();
        }


        //print
        System.out.println("*******************Employee table********************** "+"\n");

        for (int i = 0; i < size; i++) {

            System.out.println("Emp Index :" + " "+ i + "  :  " + Empname[i]+"  : "+id[i]+" : "+salary[i]);
        }




    }
}
