package org.java.reviced.loop.patterns;

public class Pyramid {
    public static void main(String[] args) {

        //1st
        for (int i = 0; i < 5; i++) {



            //nested loop
            for(int j=0; j<i; j++){
                System.out.print("*");

            }

            System.out.println("*");

        }

        System.out.println("Second pattern");

              //2nd
        for (int i = 1; i <=5; i++) {

            //space
            for (int k=i; k<5; k++){
                System.out.print(" ");


            }
            //stars
            for(int j=1; j<=(2*i-1); j++){

                System.out.print("*");


            }
            System.out.println();


        }
      

    }

}



//1st

//*
//**
//***
//****
//*****


//2nd

//                  *
//                 * *
//                * * *
//               * * * *