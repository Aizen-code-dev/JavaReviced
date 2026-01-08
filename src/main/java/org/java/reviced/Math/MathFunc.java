package org.java.reviced.Math;

import java.util.Scanner;

public class MathFunc {
    public static void main(String[] args) {

//        user Input

        Scanner sc =new Scanner(System.in);
        System.out.println("Choose option :"+ "\n" + "1: maxvalue"+"\n" + "2: Minvalue"+"\n"+ "3: SquareRoot"+"\n"+"4: Power"+"\n"+"5: Random");
      int option = sc.nextInt();

        switch (option){

            case 1:
                System.out.println("Enter First Num: ");
                int a =sc.nextInt();

                System.out.println("Enter Second Num: ");
                int b =sc.nextInt();


                System.out.println("maxvalue is: "+ Math.max(a,b));
                break;

            case 2:

                System.out.println("Enter First Num: ");
                int c =sc.nextInt();

                System.out.println("Enter Second Num: ");
                int d =sc.nextInt();

                System.out.println("min values : " + Math.min(c,d));
                break;

            case 3:
                System.out.println("Enter  Num: ");
                int e =sc.nextInt();
                System.out.println("Sqaure root values : " + Math.sqrt(e));
                break;
            case 4:
                System.out.println("Enter  Num: ");
                int f =sc.nextInt();

                System.out.println("Enter power: ");
                int g =sc.nextInt();
                System.out.println("Power values : " + Math.pow(f,g));
                break;


            case 5:
                System.out.println("Random values : " + Math.random());
                break;


//            default :
//                System.out.println("Error");
//                break;
            }
            sc.close();
        }


    }

